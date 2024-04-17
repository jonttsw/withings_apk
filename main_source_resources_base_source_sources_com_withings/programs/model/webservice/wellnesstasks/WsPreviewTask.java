package com.withings.programs.model.webservice.wellnesstasks;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.webservice.WsTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsPreviewTask.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0088\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006:"}, d2 = {"Lcom/withings/programs/model/webservice/wellnesstasks/WsPreviewTask;", "", "type", "", "identifier", "taskIdentifier", "taskIndex", "", "title", "thumbnail", "required", "", "listInfoTags", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "goal", "", "measureType", "metadata", "Lcom/withings/programs/model/webservice/wellnesstasks/WsMetadata;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Lcom/withings/programs/model/webservice/wellnesstasks/WsMetadata;)V", "getGoal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getIdentifier", "()Ljava/lang/String;", "getListInfoTags", "()Ljava/util/List;", "getMeasureType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetadata", "()Lcom/withings/programs/model/webservice/wellnesstasks/WsMetadata;", "getRequired", "()Z", "getTaskIdentifier", "getTaskIndex", "()I", "getThumbnail", "getTitle", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Lcom/withings/programs/model/webservice/wellnesstasks/WsMetadata;)Lcom/withings/programs/model/webservice/wellnesstasks/WsPreviewTask;", "equals", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsPreviewTask {
    @SerializedName("goal")
    private final Double goal;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("extra_highlight_info")
    private final List<WsTag> listInfoTags;
    @SerializedName("measure_type")
    private final Integer measureType;
    @SerializedName("metadata")
    private final WsMetadata metadata;
    @SerializedName("required")
    private final boolean required;
    @SerializedName("task_identifier")
    private final String taskIdentifier;
    @SerializedName("task_index")
    private final int taskIndex;
    @SerializedName("thumbnail")
    private final String thumbnail;
    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final String type;

    public WsPreviewTask(String type, String identifier, String taskIdentifier, int i11, String title, String thumbnail, boolean z5, List<WsTag> listInfoTags, Double d11, Integer num, WsMetadata wsMetadata) {
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
        this.metadata = wsMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsPreviewTask copy$default(WsPreviewTask wsPreviewTask, String str, String str2, String str3, int i11, String str4, String str5, boolean z5, List list, Double d11, Integer num, WsMetadata wsMetadata, int i12, Object obj) {
        String str6;
        String str7;
        String str8;
        int i13;
        String str9;
        String str10;
        boolean z11;
        List<WsTag> list2;
        Double d12;
        Integer num2;
        WsMetadata wsMetadata2;
        if ((i12 & 1) != 0) {
            str6 = wsPreviewTask.type;
        } else {
            str6 = str;
        }
        if ((i12 & 2) != 0) {
            str7 = wsPreviewTask.identifier;
        } else {
            str7 = str2;
        }
        if ((i12 & 4) != 0) {
            str8 = wsPreviewTask.taskIdentifier;
        } else {
            str8 = str3;
        }
        if ((i12 & 8) != 0) {
            i13 = wsPreviewTask.taskIndex;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            str9 = wsPreviewTask.title;
        } else {
            str9 = str4;
        }
        if ((i12 & 32) != 0) {
            str10 = wsPreviewTask.thumbnail;
        } else {
            str10 = str5;
        }
        if ((i12 & 64) != 0) {
            z11 = wsPreviewTask.required;
        } else {
            z11 = z5;
        }
        if ((i12 & 128) != 0) {
            list2 = wsPreviewTask.listInfoTags;
        } else {
            list2 = list;
        }
        if ((i12 & 256) != 0) {
            d12 = wsPreviewTask.goal;
        } else {
            d12 = d11;
        }
        if ((i12 & 512) != 0) {
            num2 = wsPreviewTask.measureType;
        } else {
            num2 = num;
        }
        if ((i12 & 1024) != 0) {
            wsMetadata2 = wsPreviewTask.metadata;
        } else {
            wsMetadata2 = wsMetadata;
        }
        return wsPreviewTask.copy(str6, str7, str8, i13, str9, str10, z11, list2, d12, num2, wsMetadata2);
    }

    public final String component1() {
        return this.type;
    }

    public final Integer component10() {
        return this.measureType;
    }

    public final WsMetadata component11() {
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

    public final List<WsTag> component8() {
        return this.listInfoTags;
    }

    public final Double component9() {
        return this.goal;
    }

    public final WsPreviewTask copy(String type, String identifier, String taskIdentifier, int i11, String title, String thumbnail, boolean z5, List<WsTag> listInfoTags, Double d11, Integer num, WsMetadata wsMetadata) {
        u.j(type, "type");
        u.j(identifier, "identifier");
        u.j(taskIdentifier, "taskIdentifier");
        u.j(title, "title");
        u.j(thumbnail, "thumbnail");
        u.j(listInfoTags, "listInfoTags");
        return new WsPreviewTask(type, identifier, taskIdentifier, i11, title, thumbnail, z5, listInfoTags, d11, num, wsMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsPreviewTask)) {
            return false;
        }
        WsPreviewTask wsPreviewTask = (WsPreviewTask) obj;
        if (u.e(this.type, wsPreviewTask.type) && u.e(this.identifier, wsPreviewTask.identifier) && u.e(this.taskIdentifier, wsPreviewTask.taskIdentifier) && this.taskIndex == wsPreviewTask.taskIndex && u.e(this.title, wsPreviewTask.title) && u.e(this.thumbnail, wsPreviewTask.thumbnail) && this.required == wsPreviewTask.required && u.e(this.listInfoTags, wsPreviewTask.listInfoTags) && u.e(this.goal, wsPreviewTask.goal) && u.e(this.measureType, wsPreviewTask.measureType) && u.e(this.metadata, wsPreviewTask.metadata)) {
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

    public final List<WsTag> getListInfoTags() {
        return this.listInfoTags;
    }

    public final Integer getMeasureType() {
        return this.measureType;
    }

    public final WsMetadata getMetadata() {
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
        WsMetadata wsMetadata = this.metadata;
        if (wsMetadata != null) {
            i11 = wsMetadata.hashCode();
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
        List<WsTag> list = this.listInfoTags;
        Double d11 = this.goal;
        Integer num = this.measureType;
        WsMetadata wsMetadata = this.metadata;
        StringBuilder b10 = l0.b("WsPreviewTask(type=", str, ", identifier=", str2, ", taskIdentifier=");
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
        b10.append(wsMetadata);
        b10.append(")");
        return b10.toString();
    }
}
