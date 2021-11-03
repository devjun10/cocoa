package main.java.model;

import java.util.*;

public class Members {
    private static final int MEMBER_SIZE = 34;
    private static final List<Member> list= new ArrayList<>();

    /**
     *  Repository에
     * */
    static {
        for(int i=1; i<MEMBER_SIZE; i++){
            list.add(new Member(i, new Name("")));
        }

    }

    public Members() {
        validateSize(list);
        validateDuplicate(list);
    }

    private void validateSize(List<Member> members){
        if(members.size()!=MEMBER_SIZE){
            throw new IllegalArgumentException("Invalid MemberSize Exception");
        }
    }

    private void validateDuplicate(List<Member> members){
        Set<Member> noDuplicateMembers = new HashSet<>(members);
        if(noDuplicateMembers.size() != MEMBER_SIZE){
            throw new IllegalArgumentException("Duplicate Member Exception");
        }
    }
}