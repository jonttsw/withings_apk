package com.withings.device.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.LinkUserDeviceException;
import com.withings.webservices.legacy.common.exception.PartnerScaleAlreadyUsedException;
import com.withings.webservices.legacy.common.exception.ScaleSingleUserAutoAssignException;
import java.util.Map;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: DeviceApi.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\f\bg\u0018\u0000 I2\u00020\u0001:\u0001IJ\u0012\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'J6\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H'J\u001e\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'J&\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u0019\u0010\u0010\u001a\u00020\u00012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004H'J\u0014\u0010\u0017\u001a\u00020\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004H'J\u001e\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004H'J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH'J%\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u000b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001aH'¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H'J-\u0010'\u001a\u00020(2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u001a2\b\b\u0003\u0010*\u001a\u00020+H'¢\u0006\u0002\u0010,J\u001c\u0010-\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010-\u001a\u00020\u001aH'J\u0012\u0010.\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000bH'J2\u0010/\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0001\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000101H'J%\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u00104\u001a\u00020\u00042\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u00106J(\u00107\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u00108\u001a\u00020\u00042\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0004H'J\u001c\u0010:\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010;\u001a\u00020\u001aH'J\u0095\u0001\u0010<\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010=\u001a\u00020>2\b\b\u0001\u0010?\u001a\u00020>2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010@\u001a\u00020\u000b2\b\b\u0001\u0010A\u001a\u00020\u000b2\b\b\u0001\u0010B\u001a\u00020\u00042\b\b\u0001\u0010C\u001a\u00020+2\b\b\u0001\u0010D\u001a\u00020+2\b\b\u0001\u0010E\u001a\u00020\u001a2\b\b\u0001\u00109\u001a\u00020\u00042\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010+H'¢\u0006\u0002\u0010H¨\u0006JÀ\u0006\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceApi;", "", "createAssociation", "deviceSession", "", "timezone", "carrierCountryCode", "deviceCountryCode", "createPublicKey", "Lcom/withings/device/ws/SharePublicKey;", NavigationArguments.USER_ID, "", "deviceId", "deleteAssociation", "associationId", "accountId", "deleteLink", "linkid", "(Ljava/lang/Long;)Ljava/lang/Object;", "getAssociationForDevice", "Lcom/withings/device/ws/Associations;", "deviceid", "enrich", "getAssociations", "getAssociationsByType", "type", "", "getDeviceLink", "Lcom/withings/device/ws/Link;", "getFirmwareUpgrade", "Lcom/withings/device/ws/FirmwareUpgrade;", "softVersion", "httpsLink", "(JLjava/lang/Integer;)Lcom/withings/device/ws/FirmwareUpgrade;", "getProperties", "Lcom/withings/device/ws/DeviceProperties;", "(Ljava/lang/Long;)Lcom/withings/device/ws/DeviceProperties;", "getSettings", "Lcom/withings/device/ws/DeviceSettings;", "getUserLinks", "Lcom/withings/device/ws/Links;", "deviceType", ConstantsWs.SYNC_PROCESS_ALL, "", "(JLjava/lang/Integer;Z)Lcom/withings/device/ws/Links;", "notifySetup", "resetDevice", "setSettings", "options", "", "storeLink", "Lcom/withings/device/ws/StoreLink;", "sessioniddevice", "userid", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/withings/device/ws/StoreLink;", "updateAssociation", "name", "data", "updateNetwork", "network", "updateProperties", "latitude", "", "longitude", "impedancemeter", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "prefLang", "micMute", "isExtraSensitivityEnabled", "measurementIntervalTime", "classification", "vuMeter", "(JDDLjava/lang/String;JJLjava/lang/String;ZZILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Ljava/lang/Object;", "Companion", "device-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeviceApi {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ENRICH_TRUE = "t";
    public static final int HTTPS_LINK_TRUE = 1;

    /* compiled from: DeviceApi.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/device/ws/DeviceApi$Companion;", "", "()V", "ENRICH_TRUE", "", "HTTPS_LINK_TRUE", "", "device-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ENRICH_TRUE = "t";
        public static final int HTTPS_LINK_TRUE = 1;

        private Companion() {
        }
    }

    /* compiled from: DeviceApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Associations getAssociationForDevice$default(DeviceApi deviceApi, long j5, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = "t";
            }
            return deviceApi.getAssociationForDevice(j5, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationForDevice");
    }

    static /* synthetic */ Associations getAssociations$default(DeviceApi deviceApi, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = "t";
            }
            return deviceApi.getAssociations(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociations");
    }

    static /* synthetic */ Associations getAssociationsByType$default(DeviceApi deviceApi, int i11, String str, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                str = "t";
            }
            return deviceApi.getAssociationsByType(i11, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationsByType");
    }

    static /* synthetic */ FirmwareUpgrade getFirmwareUpgrade$default(DeviceApi deviceApi, long j5, Integer num, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = 1;
            }
            return deviceApi.getFirmwareUpgrade(j5, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirmwareUpgrade");
    }

    static /* synthetic */ Links getUserLinks$default(DeviceApi deviceApi, long j5, Integer num, boolean z5, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z5 = true;
            }
            return deviceApi.getUserLinks(j5, num, z5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserLinks");
    }

    @POST("/v2/association?action=create")
    @FormUrlEncoded
    Object createAssociation(@Field("sessioniddevice") String str) throws AlreadyAssociatedException, PartnerScaleAlreadyUsedException, ScaleSingleUserAutoAssignException;

    @POST("/v2/association?action=create")
    @FormUrlEncoded
    Object createAssociation(@Field("sessioniddevice") String str, @Field("timezone") String str2, @Field("carrier_country_code") String str3, @Field("device_country_code") String str4) throws AlreadyAssociatedException, PartnerScaleAlreadyUsedException, ScaleSingleUserAutoAssignException;

    @POST("/v2/association?action=createpublickey")
    @FormUrlEncoded
    SharePublicKey createPublicKey(@Field("userid") long j5, @Field("deviceid") long j11);

    @POST("/v2/association?action=delete")
    @FormUrlEncoded
    Object deleteAssociation(@Field("associationid") long j5, @Field("accountid") long j11, @Field("deviceid") long j12);

    @POST("/v2/link?action=delete")
    @FormUrlEncoded
    Object deleteLink(@Field("linkid") Long l5) throws LinkUserDeviceException;

    @POST("/association?action=getbydeviceid")
    @FormUrlEncoded
    Associations getAssociationForDevice(@Field("deviceid") long j5, @Field("enrich") String str);

    @POST("/association?action=getbyaccountid")
    @FormUrlEncoded
    Associations getAssociations(@Field("enrich") String str);

    @POST("/association?action=getbyaccountid")
    @FormUrlEncoded
    Associations getAssociationsByType(@Field("type") int i11, @Field("enrich") String str);

    @POST("/v2/link?action=get")
    Link getDeviceLink();

    @POST("/v2/firmware?action=getupdate")
    @FormUrlEncoded
    FirmwareUpgrade getFirmwareUpgrade(@Field("currentfw") long j5, @Field("httpslink") Integer num);

    @POST("/device?action=getproperties")
    @FormUrlEncoded
    DeviceProperties getProperties(@Field("deviceid") Long l5);

    @POST("/v2/device?action=getsettings")
    DeviceSettings getSettings();

    @POST("/v2/link?action=get")
    @FormUrlEncoded
    Links getUserLinks(@Field("userid") long j5, @Field("devicetype") Integer num, @Field("all") boolean z5);

    @POST("/device?action=update")
    @FormUrlEncoded
    Object notifySetup(@Field("deviceid") long j5, @Field("notify_install") int i11);

    @POST("/v2/device?action=reset")
    @FormUrlEncoded
    Object resetDevice(@Field("deviceid") long j5);

    @POST("/v2/device?action=setsettings")
    @FormUrlEncoded
    Object setSettings(@Field("deviceid") long j5, @Field("type") int i11, @FieldMap Map<String, ? extends Object> map);

    @POST("/v2/link?action=store")
    @FormUrlEncoded
    StoreLink storeLink(@Field("sessioniddevice") String str, @Field("userid") Long l5);

    @POST("/association?action=update")
    @FormUrlEncoded
    Object updateAssociation(@Field("associationid") long j5, @Field("name") String str, @Field("data") String str2);

    @POST("/device?action=update")
    @FormUrlEncoded
    Object updateNetwork(@Field("deviceid") long j5, @Field("network") int i11);

    @POST("/device?action=update")
    @FormUrlEncoded
    Object updateProperties(@Field("deviceid") long j5, @Field("latitude") double d11, @Field("longitude") double d12, @Field("timezone") String str, @Field("impedancemeter") long j11, @Field("debug") long j12, @Field("preflang") String str2, @Field("mic_mute") boolean z5, @Field("presence_sensitivity") boolean z11, @Field("measure_interval_time") int i11, @Field("data") String str3, @Field("classification") Integer num, @Field("vu_meter") Boolean bool);
}
