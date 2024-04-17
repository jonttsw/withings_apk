package com.withings.reminder.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.h;
import com.google.android.gms.internal.mlkit_common.a;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.joda.time.DateTime;
/* compiled from: Reminder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010.R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u0010\u0004\"\u0004\b1\u00102R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b3\u0010\u0004\"\u0004\b4\u00102R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010/\u001a\u0004\b5\u0010\u0004\"\u0004\b6\u00102R\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010:R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\b;\u0010\t\"\u0004\b<\u0010:R$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010:R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010?\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010BR\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00107\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010:R\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/withings/reminder/model/Reminder;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Long;", "component2", "component3", "Lorg/joda/time/DateTime;", "component4", "()Lorg/joda/time/DateTime;", "component5", "component6", "", "", "component7", "()Ljava/util/List;", "component8", "", "component9", "()Z", "id", "wsId", "typeWsId", "createdDate", "updatedDate", "muteDate", ConstantsWs.RANGESTR_DAYS, "time", StreamManagement.Enabled.ELEMENT, "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Lorg/joda/time/DateTime;Z)Lcom/withings/reminder/model/Reminder;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "setId", "(Ljava/lang/Long;)V", "getWsId", "setWsId", "getTypeWsId", "setTypeWsId", "Lorg/joda/time/DateTime;", "getCreatedDate", "setCreatedDate", "(Lorg/joda/time/DateTime;)V", "getUpdatedDate", "setUpdatedDate", "getMuteDate", "setMuteDate", "Ljava/util/List;", "getDays", "setDays", "(Ljava/util/List;)V", "getTime", "setTime", "Z", "getEnabled", "setEnabled", "(Z)V", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Lorg/joda/time/DateTime;Z)V", "reminder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Reminder implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Reminder> CREATOR = new Creator();
    private DateTime createdDate;
    private List<Integer> days;
    private boolean enabled;

    /* renamed from: id  reason: collision with root package name */
    private Long f43888id;
    private DateTime muteDate;
    private DateTime time;
    private Long typeWsId;
    private DateTime updatedDate;
    private Long wsId;

    /* compiled from: Reminder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Reminder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reminder createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf3 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new Reminder(valueOf, valueOf2, valueOf3, dateTime, dateTime2, dateTime3, arrayList, (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reminder[] newArray(int i11) {
            return new Reminder[i11];
        }
    }

    public Reminder() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Reminder copy$default(Reminder reminder, Long l5, Long l6, Long l11, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List list, DateTime dateTime4, boolean z5, int i11, Object obj) {
        Long l12;
        Long l13;
        Long l14;
        DateTime dateTime5;
        DateTime dateTime6;
        DateTime dateTime7;
        List<Integer> list2;
        DateTime dateTime8;
        boolean z11;
        if ((i11 & 1) != 0) {
            l12 = reminder.f43888id;
        } else {
            l12 = l5;
        }
        if ((i11 & 2) != 0) {
            l13 = reminder.wsId;
        } else {
            l13 = l6;
        }
        if ((i11 & 4) != 0) {
            l14 = reminder.typeWsId;
        } else {
            l14 = l11;
        }
        if ((i11 & 8) != 0) {
            dateTime5 = reminder.createdDate;
        } else {
            dateTime5 = dateTime;
        }
        if ((i11 & 16) != 0) {
            dateTime6 = reminder.updatedDate;
        } else {
            dateTime6 = dateTime2;
        }
        if ((i11 & 32) != 0) {
            dateTime7 = reminder.muteDate;
        } else {
            dateTime7 = dateTime3;
        }
        if ((i11 & 64) != 0) {
            list2 = reminder.days;
        } else {
            list2 = list;
        }
        if ((i11 & 128) != 0) {
            dateTime8 = reminder.time;
        } else {
            dateTime8 = dateTime4;
        }
        if ((i11 & 256) != 0) {
            z11 = reminder.enabled;
        } else {
            z11 = z5;
        }
        return reminder.copy(l12, l13, l14, dateTime5, dateTime6, dateTime7, list2, dateTime8, z11);
    }

    public final Long component1() {
        return this.f43888id;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final Long component3() {
        return this.typeWsId;
    }

    public final DateTime component4() {
        return this.createdDate;
    }

    public final DateTime component5() {
        return this.updatedDate;
    }

    public final DateTime component6() {
        return this.muteDate;
    }

    public final List<Integer> component7() {
        return this.days;
    }

    public final DateTime component8() {
        return this.time;
    }

    public final boolean component9() {
        return this.enabled;
    }

    public final Reminder copy(Long l5, Long l6, Long l11, DateTime createdDate, DateTime updatedDate, DateTime dateTime, List<Integer> days, DateTime time, boolean z5) {
        u.j(createdDate, "createdDate");
        u.j(updatedDate, "updatedDate");
        u.j(days, "days");
        u.j(time, "time");
        return new Reminder(l5, l6, l11, createdDate, updatedDate, dateTime, days, time, z5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) obj;
        if (u.e(this.f43888id, reminder.f43888id) && u.e(this.wsId, reminder.wsId) && u.e(this.typeWsId, reminder.typeWsId) && u.e(this.createdDate, reminder.createdDate) && u.e(this.updatedDate, reminder.updatedDate) && u.e(this.muteDate, reminder.muteDate) && u.e(this.days, reminder.days) && u.e(this.time, reminder.time) && this.enabled == reminder.enabled) {
            return true;
        }
        return false;
    }

    public final DateTime getCreatedDate() {
        return this.createdDate;
    }

    public final List<Integer> getDays() {
        return this.days;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Long getId() {
        return this.f43888id;
    }

    public final DateTime getMuteDate() {
        return this.muteDate;
    }

    public final DateTime getTime() {
        return this.time;
    }

    public final Long getTypeWsId() {
        return this.typeWsId;
    }

    public final DateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public final Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Long l5 = this.f43888id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.wsId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Long l11 = this.typeWsId;
        if (l11 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l11.hashCode();
        }
        int b10 = a.b(this.updatedDate, a.b(this.createdDate, (i13 + hashCode3) * 31, 31), 31);
        DateTime dateTime = this.muteDate;
        if (dateTime != null) {
            i11 = dateTime.hashCode();
        }
        return Boolean.hashCode(this.enabled) + a.b(this.time, e.b(this.days, (b10 + i11) * 31, 31), 31);
    }

    public final void setCreatedDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.createdDate = dateTime;
    }

    public final void setDays(List<Integer> list) {
        u.j(list, "<set-?>");
        this.days = list;
    }

    public final void setEnabled(boolean z5) {
        this.enabled = z5;
    }

    public final void setId(Long l5) {
        this.f43888id = l5;
    }

    public final void setMuteDate(DateTime dateTime) {
        this.muteDate = dateTime;
    }

    public final void setTime(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.time = dateTime;
    }

    public final void setTypeWsId(Long l5) {
        this.typeWsId = l5;
    }

    public final void setUpdatedDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.updatedDate = dateTime;
    }

    public final void setWsId(Long l5) {
        this.wsId = l5;
    }

    public String toString() {
        Long l5 = this.f43888id;
        Long l6 = this.wsId;
        Long l11 = this.typeWsId;
        DateTime dateTime = this.createdDate;
        DateTime dateTime2 = this.updatedDate;
        DateTime dateTime3 = this.muteDate;
        List<Integer> list = this.days;
        DateTime dateTime4 = this.time;
        boolean z5 = this.enabled;
        StringBuilder sb2 = new StringBuilder("Reminder(id=");
        sb2.append(l5);
        sb2.append(", wsId=");
        sb2.append(l6);
        sb2.append(", typeWsId=");
        sb2.append(l11);
        sb2.append(", createdDate=");
        sb2.append(dateTime);
        sb2.append(", updatedDate=");
        sb2.append(dateTime2);
        sb2.append(", muteDate=");
        sb2.append(dateTime3);
        sb2.append(", days=");
        sb2.append(list);
        sb2.append(", time=");
        sb2.append(dateTime4);
        sb2.append(", enabled=");
        return h.d(sb2, z5, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.f43888id;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        Long l6 = this.wsId;
        if (l6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l6.longValue());
        }
        Long l11 = this.typeWsId;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeSerializable(this.createdDate);
        out.writeSerializable(this.updatedDate);
        out.writeSerializable(this.muteDate);
        List<Integer> list = this.days;
        out.writeInt(list.size());
        for (Integer num : list) {
            out.writeInt(num.intValue());
        }
        out.writeSerializable(this.time);
        out.writeInt(this.enabled ? 1 : 0);
    }

    public Reminder(Long l5, Long l6, Long l11, DateTime createdDate, DateTime updatedDate, DateTime dateTime, List<Integer> days, DateTime time, boolean z5) {
        u.j(createdDate, "createdDate");
        u.j(updatedDate, "updatedDate");
        u.j(days, "days");
        u.j(time, "time");
        this.f43888id = l5;
        this.wsId = l6;
        this.typeWsId = l11;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.muteDate = dateTime;
        this.days = days;
        this.time = time;
        this.enabled = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Reminder(java.lang.Long r11, java.lang.Long r12, java.lang.Long r13, org.joda.time.DateTime r14, org.joda.time.DateTime r15, org.joda.time.DateTime r16, java.util.List r17, org.joda.time.DateTime r18, boolean r19, int r20, kotlin.jvm.internal.m r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r11
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r12
        L11:
            r4 = r0 & 4
            if (r4 == 0) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r13
        L18:
            r5 = r0 & 8
            java.lang.String r6 = "now(...)"
            if (r5 == 0) goto L26
            org.joda.time.DateTime r5 = org.joda.time.DateTime.now()
            kotlin.jvm.internal.u.i(r5, r6)
            goto L27
        L26:
            r5 = r14
        L27:
            r7 = r0 & 16
            if (r7 == 0) goto L33
            org.joda.time.DateTime r7 = org.joda.time.DateTime.now()
            kotlin.jvm.internal.u.i(r7, r6)
            goto L34
        L33:
            r7 = r15
        L34:
            r8 = r0 & 32
            if (r8 == 0) goto L39
            goto L3b
        L39:
            r2 = r16
        L3b:
            r8 = r0 & 64
            if (r8 == 0) goto L45
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L47
        L45:
            r8 = r17
        L47:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L53
            org.joda.time.DateTime r9 = org.joda.time.DateTime.now()
            kotlin.jvm.internal.u.i(r9, r6)
            goto L55
        L53:
            r9 = r18
        L55:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5b
            r0 = 0
            goto L5d
        L5b:
            r0 = r19
        L5d:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r7
            r17 = r2
            r18 = r8
            r19 = r9
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.reminder.model.Reminder.<init>(java.lang.Long, java.lang.Long, java.lang.Long, org.joda.time.DateTime, org.joda.time.DateTime, org.joda.time.DateTime, java.util.List, org.joda.time.DateTime, boolean, int, kotlin.jvm.internal.m):void");
    }
}
