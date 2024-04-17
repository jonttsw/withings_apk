package com.withings.reminder.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import androidx.compose.material.v;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import l1.a;
/* compiled from: ReminderType.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\bR\u0010SJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000bJ\u0092\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\bJ \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u00101R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u0010\u0004\"\u0004\b4\u00105R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b6\u0010\u0004\"\u0004\b7\u00105R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010;R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010?R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010<\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010?R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010?R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\bD\u0010\u000b\"\u0004\bE\u0010?R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010?R\"\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010<\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010?R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010J\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010MR\"\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00108\u001a\u0004\bN\u0010\b\"\u0004\bO\u0010;R\"\u0010!\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\bP\u0010\u000b\"\u0004\bQ\u0010?¨\u0006T"}, d2 = {"Lcom/withings/reminder/model/ReminderType;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Long;", "component2", "", "component3", "()I", "", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "", "component10", "()Ljava/util/List;", "component11", "component12", "id", "reminderTypeId", "category", "categoryName", "name", RemoteMessageConst.Notification.COLOR, "info1", "info2", "timelineName", "defaultDays", "defaultTime", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "copy", "(Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)Lcom/withings/reminder/model/ReminderType;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "getReminderTypeId", "setReminderTypeId", "I", "getCategory", "setCategory", "(I)V", "Ljava/lang/String;", "getCategoryName", "setCategoryName", "(Ljava/lang/String;)V", "getName", "setName", "getColor", "setColor", "getInfo1", "setInfo1", "getInfo2", "setInfo2", "getTimelineName", "setTimelineName", "Ljava/util/List;", "getDefaultDays", "setDefaultDays", "(Ljava/util/List;)V", "getDefaultTime", "setDefaultTime", "getImage", "setImage", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReminderType implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReminderType> CREATOR = new Creator();
    private int category;
    private String categoryName;
    private String color;
    private List<Integer> defaultDays;
    private int defaultTime;

    /* renamed from: id  reason: collision with root package name */
    private Long f43889id;
    private String image;
    private String info1;
    private String info2;
    private String name;
    private Long reminderTypeId;
    private String timelineName;

    /* compiled from: ReminderType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ReminderType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderType createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new ReminderType(valueOf, valueOf2, readInt, readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReminderType[] newArray(int i11) {
            return new ReminderType[i11];
        }
    }

    public ReminderType() {
        this(null, null, 0, null, null, null, null, null, null, null, 0, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReminderType copy$default(ReminderType reminderType, Long l5, Long l6, int i11, String str, String str2, String str3, String str4, String str5, String str6, List list, int i12, String str7, int i13, Object obj) {
        Long l11;
        Long l12;
        int i14;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        List<Integer> list2;
        int i15;
        String str14;
        if ((i13 & 1) != 0) {
            l11 = reminderType.f43889id;
        } else {
            l11 = l5;
        }
        if ((i13 & 2) != 0) {
            l12 = reminderType.reminderTypeId;
        } else {
            l12 = l6;
        }
        if ((i13 & 4) != 0) {
            i14 = reminderType.category;
        } else {
            i14 = i11;
        }
        if ((i13 & 8) != 0) {
            str8 = reminderType.categoryName;
        } else {
            str8 = str;
        }
        if ((i13 & 16) != 0) {
            str9 = reminderType.name;
        } else {
            str9 = str2;
        }
        if ((i13 & 32) != 0) {
            str10 = reminderType.color;
        } else {
            str10 = str3;
        }
        if ((i13 & 64) != 0) {
            str11 = reminderType.info1;
        } else {
            str11 = str4;
        }
        if ((i13 & 128) != 0) {
            str12 = reminderType.info2;
        } else {
            str12 = str5;
        }
        if ((i13 & 256) != 0) {
            str13 = reminderType.timelineName;
        } else {
            str13 = str6;
        }
        if ((i13 & 512) != 0) {
            list2 = reminderType.defaultDays;
        } else {
            list2 = list;
        }
        if ((i13 & 1024) != 0) {
            i15 = reminderType.defaultTime;
        } else {
            i15 = i12;
        }
        if ((i13 & ModuleCopy.f28574b) != 0) {
            str14 = reminderType.image;
        } else {
            str14 = str7;
        }
        return reminderType.copy(l11, l12, i14, str8, str9, str10, str11, str12, str13, list2, i15, str14);
    }

    public final Long component1() {
        return this.f43889id;
    }

    public final List<Integer> component10() {
        return this.defaultDays;
    }

    public final int component11() {
        return this.defaultTime;
    }

    public final String component12() {
        return this.image;
    }

    public final Long component2() {
        return this.reminderTypeId;
    }

    public final int component3() {
        return this.category;
    }

    public final String component4() {
        return this.categoryName;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.color;
    }

    public final String component7() {
        return this.info1;
    }

    public final String component8() {
        return this.info2;
    }

    public final String component9() {
        return this.timelineName;
    }

    public final ReminderType copy(Long l5, Long l6, int i11, String categoryName, String name, String color, String info1, String info2, String timelineName, List<Integer> defaultDays, int i12, String image) {
        u.j(categoryName, "categoryName");
        u.j(name, "name");
        u.j(color, "color");
        u.j(info1, "info1");
        u.j(info2, "info2");
        u.j(timelineName, "timelineName");
        u.j(defaultDays, "defaultDays");
        u.j(image, "image");
        return new ReminderType(l5, l6, i11, categoryName, name, color, info1, info2, timelineName, defaultDays, i12, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderType)) {
            return false;
        }
        ReminderType reminderType = (ReminderType) obj;
        if (u.e(this.f43889id, reminderType.f43889id) && u.e(this.reminderTypeId, reminderType.reminderTypeId) && this.category == reminderType.category && u.e(this.categoryName, reminderType.categoryName) && u.e(this.name, reminderType.name) && u.e(this.color, reminderType.color) && u.e(this.info1, reminderType.info1) && u.e(this.info2, reminderType.info2) && u.e(this.timelineName, reminderType.timelineName) && u.e(this.defaultDays, reminderType.defaultDays) && this.defaultTime == reminderType.defaultTime && u.e(this.image, reminderType.image)) {
            return true;
        }
        return false;
    }

    public final int getCategory() {
        return this.category;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getColor() {
        return this.color;
    }

    public final List<Integer> getDefaultDays() {
        return this.defaultDays;
    }

    public final int getDefaultTime() {
        return this.defaultTime;
    }

    public final Long getId() {
        return this.f43889id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getInfo1() {
        return this.info1;
    }

    public final String getInfo2() {
        return this.info2;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getReminderTypeId() {
        return this.reminderTypeId;
    }

    public final String getTimelineName() {
        return this.timelineName;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.f43889id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.reminderTypeId;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return this.image.hashCode() + h.a(this.defaultTime, e.b(this.defaultDays, d.c(this.timelineName, d.c(this.info2, d.c(this.info1, d.c(this.color, d.c(this.name, d.c(this.categoryName, h.a(this.category, (i12 + i11) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setCategory(int i11) {
        this.category = i11;
    }

    public final void setCategoryName(String str) {
        u.j(str, "<set-?>");
        this.categoryName = str;
    }

    public final void setColor(String str) {
        u.j(str, "<set-?>");
        this.color = str;
    }

    public final void setDefaultDays(List<Integer> list) {
        u.j(list, "<set-?>");
        this.defaultDays = list;
    }

    public final void setDefaultTime(int i11) {
        this.defaultTime = i11;
    }

    public final void setId(Long l5) {
        this.f43889id = l5;
    }

    public final void setImage(String str) {
        u.j(str, "<set-?>");
        this.image = str;
    }

    public final void setInfo1(String str) {
        u.j(str, "<set-?>");
        this.info1 = str;
    }

    public final void setInfo2(String str) {
        u.j(str, "<set-?>");
        this.info2 = str;
    }

    public final void setName(String str) {
        u.j(str, "<set-?>");
        this.name = str;
    }

    public final void setReminderTypeId(Long l5) {
        this.reminderTypeId = l5;
    }

    public final void setTimelineName(String str) {
        u.j(str, "<set-?>");
        this.timelineName = str;
    }

    public String toString() {
        Long l5 = this.f43889id;
        Long l6 = this.reminderTypeId;
        int i11 = this.category;
        String str = this.categoryName;
        String str2 = this.name;
        String str3 = this.color;
        String str4 = this.info1;
        String str5 = this.info2;
        String str6 = this.timelineName;
        List<Integer> list = this.defaultDays;
        int i12 = this.defaultTime;
        String str7 = this.image;
        StringBuilder sb2 = new StringBuilder("ReminderType(id=");
        sb2.append(l5);
        sb2.append(", reminderTypeId=");
        sb2.append(l6);
        sb2.append(", category=");
        v.c(sb2, i11, ", categoryName=", str, ", name=");
        b.d(sb2, str2, ", color=", str3, ", info1=");
        b.d(sb2, str4, ", info2=", str5, ", timelineName=");
        c.d(sb2, str6, ", defaultDays=", list, ", defaultTime=");
        return a.b(sb2, i12, ", image=", str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.f43889id;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        Long l6 = this.reminderTypeId;
        if (l6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l6.longValue());
        }
        out.writeInt(this.category);
        out.writeString(this.categoryName);
        out.writeString(this.name);
        out.writeString(this.color);
        out.writeString(this.info1);
        out.writeString(this.info2);
        out.writeString(this.timelineName);
        List<Integer> list = this.defaultDays;
        out.writeInt(list.size());
        for (Integer num : list) {
            out.writeInt(num.intValue());
        }
        out.writeInt(this.defaultTime);
        out.writeString(this.image);
    }

    public ReminderType(Long l5, Long l6, int i11, String categoryName, String name, String color, String info1, String info2, String timelineName, List<Integer> defaultDays, int i12, String image) {
        u.j(categoryName, "categoryName");
        u.j(name, "name");
        u.j(color, "color");
        u.j(info1, "info1");
        u.j(info2, "info2");
        u.j(timelineName, "timelineName");
        u.j(defaultDays, "defaultDays");
        u.j(image, "image");
        this.f43889id = l5;
        this.reminderTypeId = l6;
        this.category = i11;
        this.categoryName = categoryName;
        this.name = name;
        this.color = color;
        this.info1 = info1;
        this.info2 = info2;
        this.timelineName = timelineName;
        this.defaultDays = defaultDays;
        this.defaultTime = i12;
        this.image = image;
    }

    public /* synthetic */ ReminderType(Long l5, Long l6, int i11, String str, String str2, String str3, String str4, String str5, String str6, List list, int i12, String str7, int i13, m mVar) {
        this((i13 & 1) != 0 ? null : l5, (i13 & 2) == 0 ? l6 : null, (i13 & 4) != 0 ? -1 : i11, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? "" : str4, (i13 & 128) != 0 ? "" : str5, (i13 & 256) != 0 ? "" : str6, (i13 & 512) != 0 ? new ArrayList() : list, (i13 & 1024) != 0 ? 0 : i12, (i13 & ModuleCopy.f28574b) == 0 ? str7 : "");
    }
}
