package com.masscode.completerecyclerview.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Mountain implements Parcelable {

    // create implementation Parcelable to this class
    private String name, elevation, photo, description, location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Mountain() {
    }

    protected Mountain(Parcel in) {
        name = in.readString();
        elevation = in.readString();
        photo = in.readString();
        description = in.readString();
        location = in.readString();
    }

    public static final Creator<Mountain> CREATOR = new Creator<Mountain>() {
        @Override
        public Mountain createFromParcel(Parcel in) {
            return new Mountain(in);
        }

        @Override
        public Mountain[] newArray(int size) {
            return new Mountain[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(elevation);
        parcel.writeString(photo);
        parcel.writeString(description);
        parcel.writeString(location);
    }
}
