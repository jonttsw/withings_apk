package com.withings.screen.model;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/withings/screen/model/DeviceScreenResponse;", "", "userScreensContext", "", "Lcom/withings/screen/model/WsDeviceScreensByUsers;", "allTimeScreens", "Lcom/withings/screen/model/WsDeviceScreen;", "groups", "Lcom/withings/screen/model/WsDeviceScreensGroup;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllTimeScreens", "()Ljava/util/List;", "getGroups", "getUserScreensContext", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreenResponse {
    @SerializedName(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_ALLTIME_SCREENS)
    private final List<WsDeviceScreen> allTimeScreens;
    private final List<WsDeviceScreensGroup> groups;
    @SerializedName(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS)
    private final List<WsDeviceScreensByUsers> userScreensContext;

    public DeviceScreenResponse(List<WsDeviceScreensByUsers> userScreensContext, List<WsDeviceScreen> allTimeScreens, List<WsDeviceScreensGroup> list) {
        u.j(userScreensContext, "userScreensContext");
        u.j(allTimeScreens, "allTimeScreens");
        this.userScreensContext = userScreensContext;
        this.allTimeScreens = allTimeScreens;
        this.groups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceScreenResponse copy$default(DeviceScreenResponse deviceScreenResponse, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deviceScreenResponse.userScreensContext;
        }
        if ((i11 & 2) != 0) {
            list2 = deviceScreenResponse.allTimeScreens;
        }
        if ((i11 & 4) != 0) {
            list3 = deviceScreenResponse.groups;
        }
        return deviceScreenResponse.copy(list, list2, list3);
    }

    public final List<WsDeviceScreensByUsers> component1() {
        return this.userScreensContext;
    }

    public final List<WsDeviceScreen> component2() {
        return this.allTimeScreens;
    }

    public final List<WsDeviceScreensGroup> component3() {
        return this.groups;
    }

    public final DeviceScreenResponse copy(List<WsDeviceScreensByUsers> userScreensContext, List<WsDeviceScreen> allTimeScreens, List<WsDeviceScreensGroup> list) {
        u.j(userScreensContext, "userScreensContext");
        u.j(allTimeScreens, "allTimeScreens");
        return new DeviceScreenResponse(userScreensContext, allTimeScreens, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreenResponse)) {
            return false;
        }
        DeviceScreenResponse deviceScreenResponse = (DeviceScreenResponse) obj;
        if (u.e(this.userScreensContext, deviceScreenResponse.userScreensContext) && u.e(this.allTimeScreens, deviceScreenResponse.allTimeScreens) && u.e(this.groups, deviceScreenResponse.groups)) {
            return true;
        }
        return false;
    }

    public final List<WsDeviceScreen> getAllTimeScreens() {
        return this.allTimeScreens;
    }

    public final List<WsDeviceScreensGroup> getGroups() {
        return this.groups;
    }

    public final List<WsDeviceScreensByUsers> getUserScreensContext() {
        return this.userScreensContext;
    }

    public int hashCode() {
        int hashCode;
        int b10 = e.b(this.allTimeScreens, this.userScreensContext.hashCode() * 31, 31);
        List<WsDeviceScreensGroup> list = this.groups;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return b10 + hashCode;
    }

    public String toString() {
        List<WsDeviceScreensByUsers> list = this.userScreensContext;
        List<WsDeviceScreen> list2 = this.allTimeScreens;
        List<WsDeviceScreensGroup> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("DeviceScreenResponse(userScreensContext=");
        sb2.append(list);
        sb2.append(", allTimeScreens=");
        sb2.append(list2);
        sb2.append(", groups=");
        return d.i(sb2, list3, ")");
    }
}
