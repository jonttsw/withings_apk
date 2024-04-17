package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import dp0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Suggestion.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b;\u0010<J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0007J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b/\u0010\u0007R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b0\u0010\u0007R$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010-\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u00103R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b5\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b7\u0010\u0004R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b8\u0010\rR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b:\u0010\u0013¨\u0006="}, d2 = {"Lcom/withings/insight/android/entity/Suggestion;", "Landroid/os/Parcelable;", "", "hasNextActions", "()Z", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "component5", "()Ljava/util/List;", "component6", "Lcom/withings/insight/android/entity/Action;", "component7", "", "component8", "()Ljava/lang/Long;", "id", "text", "title", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "actions", "unique", "onTapActionsWithConditions", "dateTime", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;)Lcom/withings/insight/android/entity/Suggestion;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getText", "getTitle", "getImage", "setImage", "(Ljava/lang/String;)V", "Ljava/util/List;", "getActions", "Z", "getUnique", "getOnTapActionsWithConditions", "Ljava/lang/Long;", "getDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Suggestion implements Parcelable {
    public static final Parcelable.Creator<Suggestion> CREATOR = new Creator();
    @SerializedName("onTapActions")
    private final List<String> actions;
    private final Long dateTime;

    /* renamed from: id  reason: collision with root package name */
    private final String f40591id;
    private String image;
    @SerializedName("conditionalOnTapActions")
    private final List<Action> onTapActionsWithConditions;
    private final String text;
    private final String title;
    private final boolean unique;

    /* compiled from: Suggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Suggestion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Suggestion createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(Action.CREATOR.createFromParcel(parcel));
                }
            }
            return new Suggestion(readString, readString2, readString3, readString4, createStringArrayList, z5, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Suggestion[] newArray(int i11) {
            return new Suggestion[i11];
        }
    }

    public Suggestion(String str, String text, String str2, String str3, List<String> list, boolean z5, List<Action> list2, Long l5) {
        u.j(text, "text");
        this.f40591id = str;
        this.text = text;
        this.title = str2;
        this.image = str3;
        this.actions = list;
        this.unique = z5;
        this.onTapActionsWithConditions = list2;
        this.dateTime = l5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, String str3, String str4, List list, boolean z5, List list2, Long l5, int i11, Object obj) {
        String str5;
        String str6;
        String str7;
        String str8;
        List<String> list3;
        boolean z11;
        List<Action> list4;
        Long l6;
        if ((i11 & 1) != 0) {
            str5 = suggestion.f40591id;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            str6 = suggestion.text;
        } else {
            str6 = str2;
        }
        if ((i11 & 4) != 0) {
            str7 = suggestion.title;
        } else {
            str7 = str3;
        }
        if ((i11 & 8) != 0) {
            str8 = suggestion.image;
        } else {
            str8 = str4;
        }
        if ((i11 & 16) != 0) {
            list3 = suggestion.actions;
        } else {
            list3 = list;
        }
        if ((i11 & 32) != 0) {
            z11 = suggestion.unique;
        } else {
            z11 = z5;
        }
        if ((i11 & 64) != 0) {
            list4 = suggestion.onTapActionsWithConditions;
        } else {
            list4 = list2;
        }
        if ((i11 & 128) != 0) {
            l6 = suggestion.dateTime;
        } else {
            l6 = l5;
        }
        return suggestion.copy(str5, str6, str7, str8, list3, z11, list4, l6);
    }

    public final String component1() {
        return this.f40591id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.image;
    }

    public final List<String> component5() {
        return this.actions;
    }

    public final boolean component6() {
        return this.unique;
    }

    public final List<Action> component7() {
        return this.onTapActionsWithConditions;
    }

    public final Long component8() {
        return this.dateTime;
    }

    public final Suggestion copy(String str, String text, String str2, String str3, List<String> list, boolean z5, List<Action> list2, Long l5) {
        u.j(text, "text");
        return new Suggestion(str, text, str2, str3, list, z5, list2, l5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        if (u.e(this.f40591id, suggestion.f40591id) && u.e(this.text, suggestion.text) && u.e(this.title, suggestion.title) && u.e(this.image, suggestion.image) && u.e(this.actions, suggestion.actions) && this.unique == suggestion.unique && u.e(this.onTapActionsWithConditions, suggestion.onTapActionsWithConditions) && u.e(this.dateTime, suggestion.dateTime)) {
            return true;
        }
        return false;
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final Long getDateTime() {
        return this.dateTime;
    }

    public final String getId() {
        return this.f40591id;
    }

    public final String getImage() {
        return this.image;
    }

    public final List<Action> getOnTapActionsWithConditions() {
        return this.onTapActionsWithConditions;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getUnique() {
        return this.unique;
    }

    public final boolean hasNextActions() {
        List<Action> list = this.onTapActionsWithConditions;
        boolean z5 = true;
        if (list != null) {
            List<Action> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (Action action : list2) {
                    if (j.r(action.getAction(), "next", false)) {
                        break;
                    }
                }
            }
            z5 = false;
            return z5;
        }
        List<String> list3 = this.actions;
        if (list3 == null) {
            return false;
        }
        List<String> list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            for (String str : list4) {
                if (j.r(str, "next", false)) {
                    break;
                }
            }
        }
        z5 = false;
        return z5;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f40591id;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c11 = d.c(this.text, hashCode * 31, 31);
        String str2 = this.title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (c11 + hashCode2) * 31;
        String str3 = this.image;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List<String> list = this.actions;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int a11 = y1.a(this.unique, (i13 + hashCode4) * 31, 31);
        List<Action> list2 = this.onTapActionsWithConditions;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int i14 = (a11 + hashCode5) * 31;
        Long l5 = this.dateTime;
        if (l5 != null) {
            i11 = l5.hashCode();
        }
        return i14 + i11;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public String toString() {
        String str = this.f40591id;
        String str2 = this.text;
        String str3 = this.title;
        String str4 = this.image;
        List<String> list = this.actions;
        boolean z5 = this.unique;
        List<Action> list2 = this.onTapActionsWithConditions;
        Long l5 = this.dateTime;
        StringBuilder b10 = l0.b("Suggestion(id=", str, ", text=", str2, ", title=");
        b.d(b10, str3, ", image=", str4, ", actions=");
        b10.append(list);
        b10.append(", unique=");
        b10.append(z5);
        b10.append(", onTapActionsWithConditions=");
        b10.append(list2);
        b10.append(", dateTime=");
        b10.append(l5);
        b10.append(")");
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.f40591id);
        out.writeString(this.text);
        out.writeString(this.title);
        out.writeString(this.image);
        out.writeStringList(this.actions);
        out.writeInt(this.unique ? 1 : 0);
        List<Action> list = this.onTapActionsWithConditions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Action action : list) {
                action.writeToParcel(out, i11);
            }
        }
        Long l5 = this.dateTime;
        if (l5 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeLong(l5.longValue());
    }

    public /* synthetic */ Suggestion(String str, String str2, String str3, String str4, List list, boolean z5, List list2, Long l5, int i11, m mVar) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, list, (i11 & 32) != 0 ? false : z5, list2, (i11 & 128) != 0 ? null : l5);
    }
}
