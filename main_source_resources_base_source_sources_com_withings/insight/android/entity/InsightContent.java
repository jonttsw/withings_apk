package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: InsightContent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJL\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\u0004R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b%\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b'\u0010\u0004R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/withings/insight/android/entity/InsightContent;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "Lcom/withings/insight/android/entity/Conversation;", "component5", "()Ljava/util/List;", "title", "subtitle", "buttonText", "buttonUrl", ConversationItemData.WS_TYPE, "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/insight/android/entity/InsightContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonText", "getButtonUrl", "Ljava/util/List;", "getConversation", "setConversation", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InsightContent implements Parcelable {
    public static final Parcelable.Creator<InsightContent> CREATOR = new Creator();
    @SerializedName("button_text")
    private final String buttonText;
    @SerializedName("button_url")
    private final String buttonUrl;
    private List<Conversation> conversation;
    private final String subtitle;
    private final String title;

    /* compiled from: InsightContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InsightContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList2.add(Conversation.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InsightContent(readString, readString2, readString3, readString4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightContent[] newArray(int i11) {
            return new InsightContent[i11];
        }
    }

    public InsightContent(String title, String subtitle, String buttonText, String str, List<Conversation> list) {
        u.j(title, "title");
        u.j(subtitle, "subtitle");
        u.j(buttonText, "buttonText");
        this.title = title;
        this.subtitle = subtitle;
        this.buttonText = buttonText;
        this.buttonUrl = str;
        this.conversation = list;
    }

    public static /* synthetic */ InsightContent copy$default(InsightContent insightContent, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = insightContent.title;
        }
        if ((i11 & 2) != 0) {
            str2 = insightContent.subtitle;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = insightContent.buttonText;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = insightContent.buttonUrl;
        }
        String str7 = str4;
        List<Conversation> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = insightContent.conversation;
        }
        return insightContent.copy(str, str5, str6, str7, list2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.buttonText;
    }

    public final String component4() {
        return this.buttonUrl;
    }

    public final List<Conversation> component5() {
        return this.conversation;
    }

    public final InsightContent copy(String title, String subtitle, String buttonText, String str, List<Conversation> list) {
        u.j(title, "title");
        u.j(subtitle, "subtitle");
        u.j(buttonText, "buttonText");
        return new InsightContent(title, subtitle, buttonText, str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsightContent)) {
            return false;
        }
        InsightContent insightContent = (InsightContent) obj;
        if (u.e(this.title, insightContent.title) && u.e(this.subtitle, insightContent.subtitle) && u.e(this.buttonText, insightContent.buttonText) && u.e(this.buttonUrl, insightContent.buttonUrl) && u.e(this.conversation, insightContent.conversation)) {
            return true;
        }
        return false;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButtonUrl() {
        return this.buttonUrl;
    }

    public final List<Conversation> getConversation() {
        return this.conversation;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.buttonText, d.c(this.subtitle, this.title.hashCode() * 31, 31), 31);
        String str = this.buttonUrl;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        List<Conversation> list = this.conversation;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final void setConversation(List<Conversation> list) {
        this.conversation = list;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.buttonText;
        String str4 = this.buttonUrl;
        List<Conversation> list = this.conversation;
        StringBuilder b10 = l0.b("InsightContent(title=", str, ", subtitle=", str2, ", buttonText=");
        b.d(b10, str3, ", buttonUrl=", str4, ", conversation=");
        return d.i(b10, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.title);
        out.writeString(this.subtitle);
        out.writeString(this.buttonText);
        out.writeString(this.buttonUrl);
        List<Conversation> list = this.conversation;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (Conversation conversation : list) {
            conversation.writeToParcel(out, i11);
        }
    }

    public /* synthetic */ InsightContent(String str, String str2, String str3, String str4, List list, int i11, m mVar) {
        this((i11 & 1) != 0 ? "" : str, str2, (i11 & 4) != 0 ? "" : str3, str4, list);
    }
}
