package CommandPattern.PultExample;

/**
 * Command.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public interface Command {
    void execute();
    void undo();
}
