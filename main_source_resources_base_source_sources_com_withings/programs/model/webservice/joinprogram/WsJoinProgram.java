package com.withings.programs.model.webservice.joinprogram;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsJoinProgram.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/programs/model/webservice/joinprogram/WsJoinProgram;", "", "instance", "Lcom/withings/programs/model/webservice/joinprogram/WsJoinInstance;", "(Lcom/withings/programs/model/webservice/joinprogram/WsJoinInstance;)V", "getInstance", "()Lcom/withings/programs/model/webservice/joinprogram/WsJoinInstance;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsJoinProgram {
    @SerializedName("instance")
    private final WsJoinInstance instance;

    public WsJoinProgram(WsJoinInstance instance) {
        u.j(instance, "instance");
        this.instance = instance;
    }

    public static /* synthetic */ WsJoinProgram copy$default(WsJoinProgram wsJoinProgram, WsJoinInstance wsJoinInstance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsJoinInstance = wsJoinProgram.instance;
        }
        return wsJoinProgram.copy(wsJoinInstance);
    }

    public final WsJoinInstance component1() {
        return this.instance;
    }

    public final WsJoinProgram copy(WsJoinInstance instance) {
        u.j(instance, "instance");
        return new WsJoinProgram(instance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsJoinProgram) && u.e(this.instance, ((WsJoinProgram) obj).instance)) {
            return true;
        }
        return false;
    }

    public final WsJoinInstance getInstance() {
        return this.instance;
    }

    public int hashCode() {
        return this.instance.hashCode();
    }

    public String toString() {
        WsJoinInstance wsJoinInstance = this.instance;
        return "WsJoinProgram(instance=" + wsJoinInstance + ")";
    }
}
