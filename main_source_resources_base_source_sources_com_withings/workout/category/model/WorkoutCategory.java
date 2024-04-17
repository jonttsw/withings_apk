package com.withings.workout.category.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import qk.a;
/* loaded from: classes5.dex */
public class WorkoutCategory implements Parcelable {
    @SerializedName("features")
    private String[] features;
    @SerializedName("glyph")
    private String glyphName;

    /* renamed from: id  reason: collision with root package name */
    private long f62949id;
    @SerializedName("indoor")
    private boolean indoor;
    @SerializedName("accelerometer_reliable")
    private boolean isAccelerometerReliable;
    @SerializedName("distance")
    private boolean isDistanceRelevant;
    @SerializedName("met_max")
    private Float maxMet;
    @SerializedName("met_min")
    private Float minMet;
    private DateTime modified;
    public String name;
    @SerializedName("trad_key")
    private String nameResName;
    private Integer priority;
    @SerializedName("display")
    private boolean shouldBeDisplayed;
    private static final Map<String, String> MAPPED_CATEGORY_NAME = new HashMap();
    public static final Parcelable.Creator<WorkoutCategory> CREATOR = new Parcelable.Creator<WorkoutCategory>() { // from class: com.withings.workout.category.model.WorkoutCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkoutCategory createFromParcel(Parcel parcel) {
            return new WorkoutCategory(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkoutCategory[] newArray(int i11) {
            return new WorkoutCategory[i11];
        }
    };

    /* loaded from: classes5.dex */
    public static class Response {
        @SerializedName("subcategories")
        public List<WorkoutCategory> categories;
    }

    /* synthetic */ WorkoutCategory(Parcel parcel, int i11) {
        this(parcel);
    }

    public static void clearCategories() {
        MAPPED_CATEGORY_NAME.clear();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String[] strArr;
        if (!(obj instanceof WorkoutCategory)) {
            return false;
        }
        WorkoutCategory workoutCategory = (WorkoutCategory) obj;
        if (workoutCategory.getId() != getId() || workoutCategory.modified != this.modified) {
            return false;
        }
        if ((workoutCategory.getNameResName() != null || getNameResName() != null) && (workoutCategory.getNameResName() == null || !workoutCategory.getNameResName().equals(getNameResName()))) {
            return false;
        }
        if ((workoutCategory.getGlyphName() != null || getGlyphName() != null) && (workoutCategory.getGlyphName() == null || !workoutCategory.getGlyphName().equals(getGlyphName()))) {
            return false;
        }
        if ((workoutCategory.getMinMet() != null || getMinMet() != null) && (workoutCategory.getMinMet() == null || !workoutCategory.getMinMet().equals(getMinMet()))) {
            return false;
        }
        if (((workoutCategory.getMaxMet() != null || getMaxMet() != null) && (workoutCategory.getMaxMet() == null || !workoutCategory.getMaxMet().equals(getMaxMet()))) || workoutCategory.indoor != this.indoor || workoutCategory.isDistanceRelevant != this.isDistanceRelevant) {
            return false;
        }
        String[] strArr2 = workoutCategory.features;
        if (((strArr2 != null || this.features != null) && ((strArr2 == null || strArr2.length != 0 || this.features != null) && (((strArr = this.features) == null || strArr.length != 0 || strArr2 != null) && !Arrays.equals(strArr2, strArr)))) || workoutCategory.isAccelerometerReliable() != isAccelerometerReliable()) {
            return false;
        }
        return true;
    }

    public String[] getFeatures() {
        return this.features;
    }

    public String getGlyphName() {
        return this.glyphName;
    }

    public int getGlyphRes() {
        return b0.G(a.a(this.glyphName));
    }

    public long getId() {
        return this.f62949id;
    }

    public Float getMaxMet() {
        return this.maxMet;
    }

    public Float getMinMet() {
        return this.minMet;
    }

    public DateTime getModified() {
        return this.modified;
    }

    public String getName(Context context) {
        String str = this.nameResName;
        if (str != null && !str.isEmpty()) {
            Map<String, String> map = MAPPED_CATEGORY_NAME;
            String str2 = map.get(this.nameResName);
            if (str2 == null) {
                String i11 = wq.a.i(context, this.nameResName);
                if (this.nameResName.equalsIgnoreCase(i11)) {
                    i11 = this.name;
                }
                String str3 = i11;
                map.put(this.nameResName, str3);
                return str3;
            }
            return str2;
        }
        return this.name;
    }

    public String getNameResName() {
        return this.nameResName;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return (int) getId();
    }

    public boolean isAccelerometerReliable() {
        return this.isAccelerometerReliable;
    }

    public boolean isDistanceRelevant() {
        return this.isDistanceRelevant;
    }

    public boolean isGoalRelevant() {
        long j5 = this.f62949id;
        if (j5 != 1 && j5 != 36) {
            return true;
        }
        return false;
    }

    public boolean isGpsRelevant() {
        if (this.isDistanceRelevant && !this.indoor) {
            return true;
        }
        return false;
    }

    public boolean isIndoor() {
        return this.indoor;
    }

    public boolean isNameRelevant() {
        if (36 != this.f62949id) {
            return true;
        }
        return false;
    }

    public void setAccelerometerReliable(boolean z5) {
        this.isAccelerometerReliable = z5;
    }

    public void setDistanceRelevant(boolean z5) {
        this.isDistanceRelevant = z5;
    }

    public void setFeatures(String[] strArr) {
        this.features = strArr;
    }

    public void setGlyphName(String str) {
        this.glyphName = str;
    }

    public void setId(long j5) {
        this.f62949id = j5;
    }

    public void setIndoor(boolean z5) {
        this.indoor = z5;
    }

    public void setMaxMet(Float f11) {
        this.maxMet = f11;
    }

    public void setMinMet(Float f11) {
        this.minMet = f11;
    }

    public void setModified(DateTime dateTime) {
        this.modified = dateTime;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameResName(String str) {
        this.nameResName = str;
    }

    public void setPriority(Integer num) {
        this.priority = num;
    }

    public void setShouldBeDisplayed(boolean z5) {
        this.shouldBeDisplayed = z5;
    }

    public boolean shouldAskActivityRecoConfirmation() {
        long j5 = this.f62949id;
        if (j5 != 1 && j5 != 2 && j5 != 6) {
            return true;
        }
        return false;
    }

    public boolean shouldBeDisplayed() {
        return this.shouldBeDisplayed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        long j5;
        parcel.writeLong(this.f62949id);
        parcel.writeString(this.name);
        parcel.writeString(this.nameResName);
        if (this.priority == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.priority.intValue());
        }
        parcel.writeString(this.glyphName);
        parcel.writeByte(this.isDistanceRelevant ? (byte) 1 : (byte) 0);
        if (this.minMet == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.minMet.floatValue());
        }
        if (this.maxMet == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.maxMet.floatValue());
        }
        parcel.writeInt(this.shouldBeDisplayed ? 1 : 0);
        parcel.writeInt(this.indoor ? 1 : 0);
        parcel.writeStringArray(this.features);
        parcel.writeInt(this.isAccelerometerReliable ? 1 : 0);
        DateTime dateTime = this.modified;
        if (dateTime != null) {
            j5 = dateTime.getMillis();
        } else {
            j5 = 0;
        }
        parcel.writeLong(j5);
    }

    public WorkoutCategory() {
    }

    private WorkoutCategory(Parcel parcel) {
        this.f62949id = parcel.readLong();
        this.name = parcel.readString();
        this.nameResName = parcel.readString();
        this.priority = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.glyphName = parcel.readString();
        this.isDistanceRelevant = parcel.readByte() != 0;
        this.minMet = parcel.readByte() == 0 ? null : Float.valueOf(parcel.readFloat());
        this.maxMet = parcel.readByte() != 0 ? Float.valueOf(parcel.readFloat()) : null;
        this.shouldBeDisplayed = parcel.readInt() == 1;
        this.indoor = parcel.readInt() == 1;
        this.features = parcel.createStringArray();
        this.isAccelerometerReliable = parcel.readInt() == 1;
        this.modified = new DateTime(parcel.readLong());
    }
}
