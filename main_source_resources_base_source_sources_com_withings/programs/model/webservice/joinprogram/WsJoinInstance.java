package com.withings.programs.model.webservice.joinprogram;

import androidx.camera.camera2.internal.o0;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
/* compiled from: WsJoinProgram.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/programs/model/webservice/joinprogram/WsJoinInstance;", "", NavigationArguments.INSTANCE_ID, "", "(I)V", "getInstanceId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsJoinInstance {
    @SerializedName("instanceid")
    private final int instanceId;

    public WsJoinInstance(int i11) {
        this.instanceId = i11;
    }

    public static /* synthetic */ WsJoinInstance copy$default(WsJoinInstance wsJoinInstance, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wsJoinInstance.instanceId;
        }
        return wsJoinInstance.copy(i11);
    }

    public final int component1() {
        return this.instanceId;
    }

    public final WsJoinInstance copy(int i11) {
        return new WsJoinInstance(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsJoinInstance) && this.instanceId == ((WsJoinInstance) obj).instanceId) {
            return true;
        }
        return false;
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public int hashCode() {
        return Integer.hashCode(this.instanceId);
    }

    public String toString() {
        return o0.a("WsJoinInstance(instanceId=", this.instanceId, ")");
    }
}
