package de.tum.in.ase.eist;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class TutorGroupStatistics {

	private TutorGroupStatistics() {

	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream){
		List<TutorGroupMeeting> MeetingStream = meetingStream.collect(Collectors.toList());
		if(MeetingStream.size()!=0){
			double durchSchnitt=0;
			for (int i = 0; i <MeetingStream.size() ; i++) {
				durchSchnitt=durchSchnitt+MeetingStream.get(i).getTimeSlot().getDuration().getSeconds();

			}
			return durchSchnitt/MeetingStream.size();
		}
	return 0;
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		List<Skill> skills=meetings.map(s-> {return s.getSkillToPractise();}).collect(Collectors.toList());
		Set<Skill> skillSet=new HashSet<>();
		for (int i = 0; i <skills.size() ; i++) {
			if(Collections.frequency(skills,skills.get(i))>1){
				skillSet.add(skills.get(i));
			}

		}
		return skillSet;
	}
}
