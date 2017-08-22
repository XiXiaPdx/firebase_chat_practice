/**
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.udacity.friendlychat;

import android.util.Log;
import android.widget.Toast;

public class FriendlyMessage {

    private String text;
    private String name;
    private String photoUrl;
    private String id;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoUrl, String pushId) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        id = pushId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj) {

        // for remove method of ArrayAdapt. It is a custom equals check to use pushId of message to be deleted as equivalence.
         if(obj instanceof FriendlyMessage){
                FriendlyMessage other = (FriendlyMessage) obj;
                return this.id.equals(other.id);
            }else{
                return false;
            }

    }
}
