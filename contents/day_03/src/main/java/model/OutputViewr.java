package main.java.model;

public enum OutputViewr implements Viewer {
    INSTANCE;

    OutputViewr() {}

    public void print(GameResult result){
        result.getMembers().forEach(System.out::println);
    }

    public void ask(StringBuilder sb){
        sb.append(Message.LINE.getDescription());
        sb.append(Message.ENTER.getDescription());
        sb.append(Message.QUESTION.getDescription());
        sb.append(Message.ENTER.getDescription());
        sb.append(Message.LINE.getDescription());
        System.out.println(sb);
        sb.setLength(0);
    }

}
