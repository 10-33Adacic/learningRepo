package com.learning.model;

import com.learning.model.Model;
import com.learning.model.entity.IsExistException;
import com.learning.model.entity.NoteBookDB;
import com.learning.view.TextConstants;

/**
 * Created by Templar on 30.07.2019.
 */
public class Compose {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void composeData() throws IsExistException {
        while (true) {
            if (testIfExist(model.getNickName())) {
                throw new IsExistException(TextConstants.LOGIN_EXIST);
            } else break;
        }
    }

    private boolean testIfExist(String nick) throws IsExistException {
        return NoteBookDB.testIfExist(nick);
    }
}
