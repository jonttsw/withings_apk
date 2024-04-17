package com.withings.insight.core.model;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: InsightContent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/withings/insight/core/model/InsightContent;", "", "title", "", "subtitle", "buttonText", "buttonUrl", ConversationItemData.WS_TYPE, "", "Lcom/withings/insight/core/model/Conversation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtonText", "()Ljava/lang/String;", "getButtonUrl", "getConversation", "()Ljava/util/List;", "setConversation", "(Ljava/util/List;)V", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsightContent {
    @SerializedName("button_text")
    private final String buttonText;
    @SerializedName("button_url")
    private final String buttonUrl;
    private List<Conversation> conversation;
    private final String subtitle;
    private final String title;

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

    public /* synthetic */ InsightContent(String str, String str2, String str3, String str4, List list, int i11, m mVar) {
        this((i11 & 1) != 0 ? "" : str, str2, (i11 & 4) != 0 ? "" : str3, str4, list);
    }
}
