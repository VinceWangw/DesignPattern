package com.wangf.Command;
import java.util.ArrayList;
import java.util.List;

//Invoker：员工类，执行命令的人
public class Staff {
    //这个集合中放了很多命令，扩展命令时直接遍历，list还能保证顺序
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        //执行完命令清空
        commandList.clear();
    }
}