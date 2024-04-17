package com.withings.device.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.LinkUserDeviceException;
import com.withings.webservices.legacy.common.exception.PartnerScaleAlreadyUsedException;
import com.withings.webservices.legacy.common.exception.ScaleSingleUserAutoAssignException;
import fr0.c;
import fr0.e;
import fr0.o;
import java.util.Map;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: DeviceRetrofit2Api.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 T2\u00020\u0001:\u0001TJ\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0006J.\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u00022\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010$\u001a\u00020#2\b\b\u0001\u0010\u001f\u001a\u00020\u000b2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010&H§@¢\u0006\u0004\b'\u0010(J\u001c\u0010*\u001a\u00020\u00132\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b*\u0010+J(\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0001\u0010,\u001a\u00020\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203H§@¢\u0006\u0004\b4\u0010(J:\u00107\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0014\b\u0001\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000105H§@¢\u0006\u0004\b7\u00108J\u001c\u0010:\u001a\u0002092\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b:\u0010+J\u0098\u0001\u0010F\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010<\u001a\u00020;2\b\b\u0001\u0010=\u001a\u00020;2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010>\u001a\u00020\u000b2\b\b\u0001\u0010?\u001a\u00020\u000b2\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020!2\b\b\u0001\u0010B\u001a\u00020!2\b\b\u0001\u0010C\u001a\u00020\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010E\u001a\u0004\u0018\u00010!H§@¢\u0006\u0004\bF\u0010GJ$\u0010H\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010H\u001a\u00020\u0007H§@¢\u0006\u0004\bH\u0010IJ$\u0010K\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010J\u001a\u00020\u0007H§@¢\u0006\u0004\bK\u0010IJ(\u0010O\u001a\u0004\u0018\u00010N2\b\b\u0001\u0010L\u001a\u00020\u000b2\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\bO\u0010PJ&\u0010R\u001a\u0004\u0018\u00010Q2\b\b\u0001\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\bR\u0010S¨\u0006UÀ\u0006\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceRetrofit2Api;", "", "", "enrich", "Lcom/withings/device/ws/Associations;", "getAssociations", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", "getAssociationsByType", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceid", "getAssociationForDevice", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "deviceSession", "timezone", "carrierCountryCode", "deviceCountryCode", "Lnm0/y;", "createAssociation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "associationId", "accountId", "deviceId", "deleteAssociation", "(JJJLqm0/d;)Ljava/lang/Object;", "name", "data", "updateAssociation", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "deviceType", "", ConstantsWs.SYNC_PROCESS_ALL, "Lcom/withings/device/ws/Links;", "getUserLinks", "(JLjava/lang/Integer;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/Link;", "getDeviceLink", "(Lqm0/d;)Ljava/lang/Object;", "linkid", "deleteLink", "(Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "sessioniddevice", "userid", "Lcom/withings/device/ws/StoreLink;", "storeLink", "(Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "resetDevice", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceSettings;", "getSettings", "", "options", "setSettings", "(JILjava/util/Map;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceProperties;", "getProperties", "", "latitude", "longitude", "impedancemeter", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "prefLang", "micMute", "isExtraSensitivityEnabled", "measurementIntervalTime", "classification", "vuMeter", "updateProperties", "(JDDLjava/lang/String;JJLjava/lang/String;ZZILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "notifySetup", "(JILqm0/d;)Ljava/lang/Object;", "network", "updateNetwork", "softVersion", "httpsLink", "Lcom/withings/device/ws/FirmwareUpgrade;", "getFirmwareUpgrade", "(JLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/SharePublicKey;", "createPublicKey", "(JJLqm0/d;)Ljava/lang/Object;", "Companion", "device-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface DeviceRetrofit2Api {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ENRICH_TRUE = "t";
    public static final int HTTPS_LINK_TRUE = 1;

    /* compiled from: DeviceRetrofit2Api.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/device/ws/DeviceRetrofit2Api$Companion;", "", "()V", "ENRICH_TRUE", "", "HTTPS_LINK_TRUE", "", "device-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ENRICH_TRUE = "t";
        public static final int HTTPS_LINK_TRUE = 1;

        private Companion() {
        }
    }

    /* compiled from: DeviceRetrofit2Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getAssociationForDevice$default(DeviceRetrofit2Api deviceRetrofit2Api, long j5, String str, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = "t";
            }
            return deviceRetrofit2Api.getAssociationForDevice(j5, str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationForDevice");
    }

    static /* synthetic */ Object getAssociations$default(DeviceRetrofit2Api deviceRetrofit2Api, String str, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = "t";
            }
            return deviceRetrofit2Api.getAssociations(str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociations");
    }

    static /* synthetic */ Object getAssociationsByType$default(DeviceRetrofit2Api deviceRetrofit2Api, int i11, String str, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                str = "t";
            }
            return deviceRetrofit2Api.getAssociationsByType(i11, str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationsByType");
    }

    static /* synthetic */ Object getFirmwareUpgrade$default(DeviceRetrofit2Api deviceRetrofit2Api, long j5, Integer num, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = 1;
            }
            return deviceRetrofit2Api.getFirmwareUpgrade(j5, num, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirmwareUpgrade");
    }

    static /* synthetic */ Object getUserLinks$default(DeviceRetrofit2Api deviceRetrofit2Api, long j5, Integer num, boolean z5, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z5 = true;
            }
            return deviceRetrofit2Api.getUserLinks(j5, num, z5, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserLinks");
    }

    @e
    @o("v2/association?action=create")
    Object createAssociation(@c("sessioniddevice") String str, @c("timezone") String str2, @c("carrier_country_code") String str3, @c("device_country_code") String str4, d<? super y> dVar) throws AlreadyAssociatedException, PartnerScaleAlreadyUsedException, ScaleSingleUserAutoAssignException;

    @e
    @o("v2/association?action=create")
    Object createAssociation(@c("sessioniddevice") String str, d<? super y> dVar) throws AlreadyAssociatedException, PartnerScaleAlreadyUsedException, ScaleSingleUserAutoAssignException;

    @e
    @o("v2/association?action=createpublickey")
    Object createPublicKey(@c("userid") long j5, @c("deviceid") long j11, d<? super SharePublicKey> dVar);

    @e
    @o("v2/association?action=delete")
    Object deleteAssociation(@c("associationid") long j5, @c("accountid") long j11, @c("deviceid") long j12, d<? super y> dVar);

    @e
    @o("v2/link?action=delete")
    Object deleteLink(@c("linkid") Long l5, d<? super y> dVar) throws LinkUserDeviceException;

    @e
    @o("association?action=getbydeviceid")
    Object getAssociationForDevice(@c("deviceid") long j5, @c("enrich") String str, d<? super Associations> dVar);

    @e
    @o("association?action=getbyaccountid")
    Object getAssociations(@c("enrich") String str, d<? super Associations> dVar);

    @e
    @o("association?action=getbyaccountid")
    Object getAssociationsByType(@c("type") int i11, @c("enrich") String str, d<? super Associations> dVar);

    @o("v2/link?action=get")
    Object getDeviceLink(d<? super Link> dVar);

    @e
    @o("v2/firmware?action=getupdate")
    Object getFirmwareUpgrade(@c("currentfw") long j5, @c("httpslink") Integer num, d<? super FirmwareUpgrade> dVar);

    @e
    @o("device?action=getproperties")
    Object getProperties(@c("deviceid") Long l5, d<? super DeviceProperties> dVar);

    @o("v2/device?action=getsettings")
    Object getSettings(d<? super DeviceSettings> dVar);

    @e
    @o("v2/link?action=get")
    Object getUserLinks(@c("userid") long j5, @c("devicetype") Integer num, @c("all") boolean z5, d<? super Links> dVar);

    @e
    @o("device?action=update")
    Object notifySetup(@c("deviceid") long j5, @c("notify_install") int i11, d<? super y> dVar);

    @e
    @o("v2/device?action=reset")
    Object resetDevice(@c("deviceid") long j5, d<? super y> dVar);

    @e
    @o("v2/device?action=setsettings")
    Object setSettings(@c("deviceid") long j5, @c("type") int i11, @fr0.d Map<String, ? extends Object> map, d<? super y> dVar);

    @e
    @o("v2/link?action=store")
    Object storeLink(@c("sessioniddevice") String str, @c("userid") Long l5, d<? super StoreLink> dVar);

    @e
    @o("association?action=update")
    Object updateAssociation(@c("associationid") long j5, @c("name") String str, @c("data") String str2, d<? super y> dVar);

    @e
    @o("device?action=update")
    Object updateNetwork(@c("deviceid") long j5, @c("network") int i11, d<? super y> dVar);

    @e
    @o("device?action=update")
    Object updateProperties(@c("deviceid") long j5, @c("latitude") double d11, @c("longitude") double d12, @c("timezone") String str, @c("impedancemeter") long j11, @c("debug") long j12, @c("preflang") String str2, @c("mic_mute") boolean z5, @c("presence_sensitivity") boolean z11, @c("measure_interval_time") int i11, @c("data") String str3, @c("classification") Integer num, @c("vu_meter") Boolean bool, d<? super y> dVar);
}
