package com.withings.screen.model;

import bn.d;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/screen/model/DeviceScreenContentResponse;", "", "deviceScreenContext", "", "Lcom/withings/screen/model/WsDeviceScreensContentsByUsers;", "(Ljava/util/List;)V", "getDeviceScreenContext", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenContentResponse {
    @SerializedName(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS)
    private final List<WsDeviceScreensContentsByUsers> deviceScreenContext;

    public DeviceScreenContentResponse(List<WsDeviceScreensContentsByUsers> deviceScreenContext) {
        u.j(deviceScreenContext, "deviceScreenContext");
        this.deviceScreenContext = deviceScreenContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceScreenContentResponse copy$default(DeviceScreenContentResponse deviceScreenContentResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deviceScreenContentResponse.deviceScreenContext;
        }
        return deviceScreenContentResponse.copy(list);
    }

    public final List<WsDeviceScreensContentsByUsers> component1() {
        return this.deviceScreenContext;
    }

    public final DeviceScreenContentResponse copy(List<WsDeviceScreensContentsByUsers> deviceScreenContext) {
        u.j(deviceScreenContext, "deviceScreenContext");
        return new DeviceScreenContentResponse(deviceScreenContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeviceScreenContentResponse) && u.e(this.deviceScreenContext, ((DeviceScreenContentResponse) obj).deviceScreenContext)) {
            return true;
        }
        return false;
    }

    public final List<WsDeviceScreensContentsByUsers> getDeviceScreenContext() {
        return this.deviceScreenContext;
    }

    public int hashCode() {
        return this.deviceScreenContext.hashCode();
    }

    public String toString() {
        return d.b("DeviceScreenContentResponse(deviceScreenContext=", this.deviceScreenContext, ")");
    }
}
