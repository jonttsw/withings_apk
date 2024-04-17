package com.withings.insight.core.model;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Suggestion.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0013Jv\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/withings/insight/core/model/Suggestion;", "", "id", "", "text", "title", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "actions", "", "unique", "", "onTapActionsWithConditions", "Lcom/withings/insight/core/model/Action;", "dateTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;)V", "getActions", "()Ljava/util/List;", "getDateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "getImage", "setImage", "(Ljava/lang/String;)V", "getOnTapActionsWithConditions", "getText", "getTitle", "getUnique", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/Long;)Lcom/withings/insight/core/model/Suggestion;", "equals", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Suggestion {
    @SerializedName("onTapActions")
    private final List<String> actions;
    private final Long dateTime;

    /* renamed from: id  reason: collision with root package name */
    private final String f40593id;
    private String image;
    @SerializedName("conditionalOnTapActions")
    private final List<Action> onTapActionsWithConditions;
    private final String text;
    private final String title;
    private final boolean unique;

    public Suggestion(String str, String text, String str2, String str3, List<String> list, boolean z5, List<Action> list2, Long l5) {
        u.j(text, "text");
        this.f40593id = str;
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
            str5 = suggestion.f40593id;
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
        return this.f40593id;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        if (u.e(this.f40593id, suggestion.f40593id) && u.e(this.text, suggestion.text) && u.e(this.title, suggestion.title) && u.e(this.image, suggestion.image) && u.e(this.actions, suggestion.actions) && this.unique == suggestion.unique && u.e(this.onTapActionsWithConditions, suggestion.onTapActionsWithConditions) && u.e(this.dateTime, suggestion.dateTime)) {
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
        return this.f40593id;
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

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f40593id;
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
        String str = this.f40593id;
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

    public /* synthetic */ Suggestion(String str, String str2, String str3, String str4, List list, boolean z5, List list2, Long l5, int i11, m mVar) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, list, (i11 & 32) != 0 ? false : z5, list2, (i11 & 128) != 0 ? null : l5);
    }
}
