/**
 * Copyright 2019 bejson.com
 */
package com.besjon.pojo;

import java.util.List;

/**
 * Auto-generated: 2019-06-02 15:20:26
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class AiResult {

    private int face_num;
    private List<AiFaceUserList> face_list;

    public void setFace_num(int face_num) {
        this.face_num = face_num;
    }

    public int getFace_num() {
        return face_num;
    }

    public void setFace_list(List<AiFaceUserList> face_list) {
        this.face_list = face_list;
    }

    public List<AiFaceUserList> getFace_list() {
        return face_list;
    }

    @Override
    public String toString() {
        return "AiResult [face_num=" + face_num + ", face_list=" + face_list + "]";
    }
}