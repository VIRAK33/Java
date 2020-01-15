package gic.i4.TP09_02;

import java.sql.SQLOutput;

public class SMS {
    String subject;
    String fromNumber, receiveNumber;
    Boolean text = false;
    String content;
    Boolean _new = false;

    //Type: Text = false ==> Type = MMS
    //Status: _new = false, ==> status = read


    public SMS(String subject) {
        this.subject = subject;
    }

    public SMS(String subject, String fromNumber, Boolean text, String content, Boolean _new) {
        this.subject = subject;
        this.fromNumber = fromNumber;
        this.text = text;
        this.content = content;
        this._new = _new;
    }

    public SMS(String subject, String fromNumber, String receiveNumber, Boolean text, String content, Boolean _new) {
        this.subject = subject;
        this.fromNumber = fromNumber;
        this.receiveNumber = receiveNumber;
        this.text = text;
        this.content = content;
        this._new = _new;
    }

    public SMS() {}


}


