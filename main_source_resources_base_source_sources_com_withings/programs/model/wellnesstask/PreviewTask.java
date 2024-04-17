package com.withings.programs.model.wellnesstask;

import am.p;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: PreviewTask.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u008a\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\f2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0004J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\tJ\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010\u0004R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\b/\u0010\u0004R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b0\u0010\u0004R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u0010\tR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b3\u0010\u0004R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b4\u0010\u0004R\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u0010\u000eR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\b8\u0010\u0012R\u0019\u0010#\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b:\u0010\u0015R\u0019\u0010$\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010;\u001a\u0004\b<\u0010\u0017R\u0019\u0010%\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b%\u0010=\u001a\u0004\b>\u0010\u001a¨\u0006A"}, d2 = {"Lcom/withings/programs/model/wellnesstask/PreviewTask;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()I", "component5", "component6", "", "component7", "()Z", "", "Lam/p;", "component8", "()Ljava/util/List;", "", "component9", "()Ljava/lang/Double;", "component10", "()Ljava/lang/Integer;", "Lcom/withings/programs/model/wellnesstask/Metadata;", "component11", "()Lcom/withings/programs/model/wellnesstask/Metadata;", "type", "identifier", "taskIdentifier", "taskIndex", "title", "thumbnail", "required", "listInfoTags", "goal", "measureType", "metadata", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Lcom/withings/programs/model/wellnesstask/Metadata;)Lcom/withings/programs/model/wellnesstask/PreviewTask;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getIdentifier", "getTaskIdentifier", "I", "getTaskIndex", "getTitle", "getThumbnail", "Z", "getRequired", "Ljava/util/List;", "getListInfoTags", "Ljava/lang/Double;", "getGoal", "Ljava/lang/Integer;", "getMeasureType", "Lcom/withings/programs/model/wellnesstask/Metadata;", "getMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Lcom/withings/programs/model/wellnesstask/Metadata;)V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PreviewTask {
    private final Double goal;
    private final String identifier;
    private final List<p> listInfoTags;
    private final Integer measureType;
    private final Metadata metadata;
    private final boolean required;
    private final String taskIdentifier;
    private final int taskIndex;
    private final String thumbnail;
    private final String title;
    private final String type;

    public PreviewTask(String type, String identifier, String taskIdentifier, int i11, String title, String thumbnail, boolean z5, List<p> listInfoTags, Double d11, Integer num, Metadata metadata) {
        u.j(type, "type");
        u.j(identifier, "identifier");
        u.j(taskIdentifier, "taskIdentifier");
        u.j(title, "title");
        u.j(thumbnail, "thumbnail");
        u.j(listInfoTags, "listInfoTags");
        this.type = type;
        this.identifier = identifier;
        this.taskIdentifier = taskIdentifier;
        this.taskIndex = i11;
        this.title = title;
        this.thumbnail = thumbnail;
        this.required = z5;
        this.listInfoTags = listInfoTags;
        this.goal = d11;
        this.measureType = num;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviewTask copy$default(PreviewTask previewTask, String str, String str2, String str3, int i11, String str4, String str5, boolean z5, List list, Double d11, Integer num, Metadata metadata, int i12, Object obj) {
        String str6;
        String str7;
        String str8;
        int i13;
        String str9;
        String str10;
        boolean z11;
        List<p> list2;
        Double d12;
        Integer num2;
        Metadata metadata2;
        if ((i12 & 1) != 0) {
            str6 = previewTask.type;
        } else {
            str6 = str;
        }
        if ((i12 & 2) != 0) {
            str7 = previewTask.identifier;
        } else {
            str7 = str2;
        }
        if ((i12 & 4) != 0) {
            str8 = previewTask.taskIdentifier;
        } else {
            str8 = str3;
        }
        if ((i12 & 8) != 0) {
            i13 = previewTask.taskIndex;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            str9 = previewTask.title;
        } else {
            str9 = str4;
        }
        if ((i12 & 32) != 0) {
            str10 = previewTask.thumbnail;
        } else {
            str10 = str5;
        }
        if ((i12 & 64) != 0) {
            z11 = previewTask.required;
        } else {
            z11 = z5;
        }
        if ((i12 & 128) != 0) {
            list2 = previewTask.listInfoTags;
        } else {
            list2 = list;
        }
        if ((i12 & 256) != 0) {
            d12 = previewTask.goal;
        } else {
            d12 = d11;
        }
        if ((i12 & 512) != 0) {
            num2 = previewTask.measureType;
        } else {
            num2 = num;
        }
        if ((i12 & 1024) != 0) {
            metadata2 = previewTask.metadata;
        } else {
            metadata2 = metadata;
        }
        return previewTask.copy(str6, str7, str8, i13, str9, str10, z11, list2, d12, num2, metadata2);
    }

    public final String component1() {
        return this.type;
    }

    public final Integer component10() {
        return this.measureType;
    }

    public final Metadata component11() {
        return this.metadata;
    }

    public final String component2() {
        return this.identifier;
    }

    public final String component3() {
        return this.taskIdentifier;
    }

    public final int component4() {
        return this.taskIndex;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.thumbnail;
    }

    public final boolean component7() {
        return this.required;
    }

    public final List<p> component8() {
        return this.listInfoTags;
    }

    public final Double component9() {
        return this.goal;
    }

    public final PreviewTask copy(String type, String identifier, String taskIdentifier, int i11, String title, String thumbnail, boolean z5, List<p> listInfoTags, Double d11, Integer num, Metadata metadata) {
        u.j(type, "type");
        u.j(identifier, "identifier");
        u.j(taskIdentifier, "taskIdentifier");
        u.j(title, "title");
        u.j(thumbnail, "thumbnail");
        u.j(listInfoTags, "listInfoTags");
        return new PreviewTask(type, identifier, taskIdentifier, i11, title, thumbnail, z5, listInfoTags, d11, num, metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewTask)) {
            return false;
        }
        PreviewTask previewTask = (PreviewTask) obj;
        if (u.e(this.type, previewTask.type) && u.e(this.identifier, previewTask.identifier) && u.e(this.taskIdentifier, previewTask.taskIdentifier) && this.taskIndex == previewTask.taskIndex && u.e(this.title, previewTask.title) && u.e(this.thumbnail, previewTask.thumbnail) && this.required == previewTask.required && u.e(this.listInfoTags, previewTask.listInfoTags) && u.e(this.goal, previewTask.goal) && u.e(this.measureType, previewTask.measureType) && u.e(this.metadata, previewTask.metadata)) {
            return true;
        }
        return false;
    }

    public final Double getGoal() {
        return this.goal;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<p> getListInfoTags() {
        return this.listInfoTags;
    }

    public final Integer getMeasureType() {
        return this.measureType;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public final int getTaskIndex() {
        return this.taskIndex;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int b10 = e.b(this.listInfoTags, y1.a(this.required, d.c(this.thumbnail, d.c(this.title, h.a(this.taskIndex, d.c(this.taskIdentifier, d.c(this.identifier, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        Double d11 = this.goal;
        int i11 = 0;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        int i12 = (b10 + hashCode) * 31;
        Integer num = this.measureType;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Metadata metadata = this.metadata;
        if (metadata != null) {
            i11 = metadata.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.identifier;
        String str3 = this.taskIdentifier;
        int i11 = this.taskIndex;
        String str4 = this.title;
        String str5 = this.thumbnail;
        boolean z5 = this.required;
        List<p> list = this.listInfoTags;
        Double d11 = this.goal;
        Integer num = this.measureType;
        Metadata metadata = this.metadata;
        StringBuilder b10 = l0.b("PreviewTask(type=", str, ", identifier=", str2, ", taskIdentifier=");
        b10.append(str3);
        b10.append(", taskIndex=");
        b10.append(i11);
        b10.append(", title=");
        b.d(b10, str4, ", thumbnail=", str5, ", required=");
        b10.append(z5);
        b10.append(", listInfoTags=");
        b10.append(list);
        b10.append(", goal=");
        b10.append(d11);
        b10.append(", measureType=");
        b10.append(num);
        b10.append(", metadata=");
        b10.append(metadata);
        b10.append(")");
        return b10.toString();
    }
}
