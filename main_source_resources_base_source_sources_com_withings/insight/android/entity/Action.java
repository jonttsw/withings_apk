package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import dp0.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
/* compiled from: Action.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010!R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\n¨\u0006&"}, d2 = {"Lcom/withings/insight/android/entity/Action;", "Landroid/os/Parcelable;", "", "requiresInput", "()Z", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/util/Map;", AMPExtension.Action.ATTRIBUTE_NAME, "conditions", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/withings/insight/android/entity/Action;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAction", "setAction", "(Ljava/lang/String;)V", "Ljava/util/Map;", "getConditions", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Action implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new Creator();
    private String action;
    private final Map<String, String> conditions;

    /* compiled from: Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Action createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Action(readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Action[] newArray(int i11) {
            return new Action[i11];
        }
    }

    public Action(String action, Map<String, String> map) {
        u.j(action, "action");
        this.action = action;
        this.conditions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Action copy$default(Action action, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = action.action;
        }
        if ((i11 & 2) != 0) {
            map = action.conditions;
        }
        return action.copy(str, map);
    }

    public final String component1() {
        return this.action;
    }

    public final Map<String, String> component2() {
        return this.conditions;
    }

    public final Action copy(String action, Map<String, String> map) {
        u.j(action, "action");
        return new Action(action, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (u.e(this.action, action.action) && u.e(this.conditions, action.conditions)) {
            return true;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final Map<String, String> getConditions() {
        return this.conditions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.action.hashCode() * 31;
        Map<String, String> map = this.conditions;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean requiresInput() {
        return j.r(this.action, "$input", false);
    }

    public final void setAction(String str) {
        u.j(str, "<set-?>");
        this.action = str;
    }

    public String toString() {
        String str = this.action;
        Map<String, String> map = this.conditions;
        return "Action(action=" + str + ", conditions=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.action);
        Map<String, String> map = this.conditions;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public /* synthetic */ Action(String str, Map map, int i11, m mVar) {
        this(str, (i11 & 2) != 0 ? null : map);
    }
}
