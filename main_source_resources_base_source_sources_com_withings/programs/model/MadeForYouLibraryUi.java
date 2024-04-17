package com.withings.programs.model;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: MadeForYouLibraryUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/withings/programs/model/MadeForYouLibraryUi;", "", NavigationArguments.CONTENT_ID, "", "ctaTextResId", "", "imageUrl", "surtitleResId", "title", "type", "Lcom/withings/contentproviders/model/content/TaskType;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/withings/contentproviders/model/content/TaskType;)V", "getContentId", "()Ljava/lang/String;", "getCtaTextResId", "()I", "getImageUrl", "getSurtitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getType", "()Lcom/withings/contentproviders/model/content/TaskType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/withings/contentproviders/model/content/TaskType;)Lcom/withings/programs/model/MadeForYouLibraryUi;", "equals", "", "other", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MadeForYouLibraryUi {
    public static final int $stable = 0;
    private final String contentId;
    private final int ctaTextResId;
    private final String imageUrl;
    private final Integer surtitleResId;
    private final String title;
    private final TaskType type;

    public MadeForYouLibraryUi(String contentId, int i11, String imageUrl, Integer num, String title, TaskType type) {
        u.j(contentId, "contentId");
        u.j(imageUrl, "imageUrl");
        u.j(title, "title");
        u.j(type, "type");
        this.contentId = contentId;
        this.ctaTextResId = i11;
        this.imageUrl = imageUrl;
        this.surtitleResId = num;
        this.title = title;
        this.type = type;
    }

    public static /* synthetic */ MadeForYouLibraryUi copy$default(MadeForYouLibraryUi madeForYouLibraryUi, String str, int i11, String str2, Integer num, String str3, TaskType taskType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = madeForYouLibraryUi.contentId;
        }
        if ((i12 & 2) != 0) {
            i11 = madeForYouLibraryUi.ctaTextResId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str2 = madeForYouLibraryUi.imageUrl;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            num = madeForYouLibraryUi.surtitleResId;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            str3 = madeForYouLibraryUi.title;
        }
        String str5 = str3;
        if ((i12 & 32) != 0) {
            taskType = madeForYouLibraryUi.type;
        }
        return madeForYouLibraryUi.copy(str, i13, str4, num2, str5, taskType);
    }

    public final String component1() {
        return this.contentId;
    }

    public final int component2() {
        return this.ctaTextResId;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final Integer component4() {
        return this.surtitleResId;
    }

    public final String component5() {
        return this.title;
    }

    public final TaskType component6() {
        return this.type;
    }

    public final MadeForYouLibraryUi copy(String contentId, int i11, String imageUrl, Integer num, String title, TaskType type) {
        u.j(contentId, "contentId");
        u.j(imageUrl, "imageUrl");
        u.j(title, "title");
        u.j(type, "type");
        return new MadeForYouLibraryUi(contentId, i11, imageUrl, num, title, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MadeForYouLibraryUi)) {
            return false;
        }
        MadeForYouLibraryUi madeForYouLibraryUi = (MadeForYouLibraryUi) obj;
        if (u.e(this.contentId, madeForYouLibraryUi.contentId) && this.ctaTextResId == madeForYouLibraryUi.ctaTextResId && u.e(this.imageUrl, madeForYouLibraryUi.imageUrl) && u.e(this.surtitleResId, madeForYouLibraryUi.surtitleResId) && u.e(this.title, madeForYouLibraryUi.title) && this.type == madeForYouLibraryUi.type) {
            return true;
        }
        return false;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getSurtitleResId() {
        return this.surtitleResId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TaskType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.imageUrl, h.a(this.ctaTextResId, this.contentId.hashCode() * 31, 31), 31);
        Integer num = this.surtitleResId;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.type.hashCode() + d.c(this.title, (c11 + hashCode) * 31, 31);
    }

    public String toString() {
        String str = this.contentId;
        int i11 = this.ctaTextResId;
        String str2 = this.imageUrl;
        Integer num = this.surtitleResId;
        String str3 = this.title;
        TaskType taskType = this.type;
        StringBuilder b10 = g.b("MadeForYouLibraryUi(contentId=", str, ", ctaTextResId=", i11, ", imageUrl=");
        b10.append(str2);
        b10.append(", surtitleResId=");
        b10.append(num);
        b10.append(", title=");
        b10.append(str3);
        b10.append(", type=");
        b10.append(taskType);
        b10.append(")");
        return b10.toString();
    }
}
