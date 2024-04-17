package com.withings.device.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.PartnerScaleAlreadyUsedException;
import com.withings.webservices.legacy.common.exception.ScaleSingleUserAutoAssignException;
import java.util.Map;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
import s00.e;
/* compiled from: DeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 Z2\u00020\u0001:\u0001ZJ\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u001f\u0010 J,\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b&\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010(H¦@¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b,\u0010-J$\u00101\u001a\u0004\u0018\u0001002\u0006\u0010.\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205H¦@¢\u0006\u0004\b6\u0010*J4\u00109\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000107H¦@¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020;2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0004\b<\u0010-J~\u0010H\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010#H¦@¢\u0006\u0004\bH\u0010IJ \u0010J\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\nH¦@¢\u0006\u0004\bJ\u0010KJ \u0010M\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\nH¦@¢\u0006\u0004\bM\u0010KJ&\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010N\u001a\u00020\u000e2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\bQ\u0010RJ\"\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020VH&¢\u0006\u0004\bX\u0010Y¨\u0006[À\u0006\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/device/ws/DeviceRemoteRepository;", "enrich", "Lcom/withings/device/ws/Associations;", "getAssociations", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", "getAssociationsByType", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "getAssociationForDevice", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "deviceSession", "timezone", "carrierCountryCode", "deviceCountryCode", "Lnm0/y;", "createAssociation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "associationId", "accountId", "deleteAssociation", "(JJJLqm0/d;)Ljava/lang/Object;", "name", "data", "updateAssociation", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "deviceType", "", ConstantsWs.SYNC_PROCESS_ALL, "Lcom/withings/device/ws/Links;", "getUserLinks", "(JLjava/lang/Integer;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/Link;", "getDeviceLink", "(Lqm0/d;)Ljava/lang/Object;", "linkId", "deleteLink", "(Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "sessionIdDevice", "userid", "Lcom/withings/device/ws/StoreLink;", "storeLink", "(Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "resetDevice", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceSettings;", "getSettings", "", "options", "setSettings", "(JILjava/util/Map;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceProperties;", "getProperties", "", "latitude", "longitude", "impedancemeter", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "prefLang", "micMute", "isExtraSensitivityEnabled", "measurementIntervalTime", "classification", "vuMeter", "updateProperties", "(JDDLjava/lang/String;JJLjava/lang/String;ZZILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "notifySetup", "(JILqm0/d;)Ljava/lang/Object;", "network", "updateNetwork", "softVersion", "httpsLink", "Lcom/withings/device/ws/FirmwareUpgrade;", "getFirmwareUpgrade", "(JLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/SharePublicKey;", "createPublicKey", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/e;", "sessionIdProvider", "withSessionIdProvider", "(Ls00/e;)Lcom/withings/device/ws/DeviceRemoteRepository;", "Companion", "device-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface DeviceRemoteRepository {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ENRICH_TRUE = "t";
    public static final int HTTPS_LINK_TRUE = 1;

    /* compiled from: DeviceRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/device/ws/DeviceRemoteRepository$Companion;", "", "()V", "ENRICH_TRUE", "", "HTTPS_LINK_TRUE", "", "device-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ENRICH_TRUE = "t";
        public static final int HTTPS_LINK_TRUE = 1;

        private Companion() {
        }
    }

    /* compiled from: DeviceRemoteRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getAssociationForDevice$default(DeviceRemoteRepository deviceRemoteRepository, long j5, String str, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = "t";
            }
            return deviceRemoteRepository.getAssociationForDevice(j5, str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationForDevice");
    }

    static /* synthetic */ Object getAssociations$default(DeviceRemoteRepository deviceRemoteRepository, String str, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = "t";
            }
            return deviceRemoteRepository.getAssociations(str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociations");
    }

    static /* synthetic */ Object getAssociationsByType$default(DeviceRemoteRepository deviceRemoteRepository, int i11, String str, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                str = "t";
            }
            return deviceRemoteRepository.getAssociationsByType(i11, str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssociationsByType");
    }

    static /* synthetic */ Object getFirmwareUpgrade$default(DeviceRemoteRepository deviceRemoteRepository, long j5, Integer num, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = 1;
            }
            return deviceRemoteRepository.getFirmwareUpgrade(j5, num, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirmwareUpgrade");
    }

    static /* synthetic */ Object getUserLinks$default(DeviceRemoteRepository deviceRemoteRepository, long j5, Integer num, boolean z5, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z5 = true;
            }
            return deviceRemoteRepository.getUserLinks(j5, num, z5, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserLinks");
    }

    Object createAssociation(String str, String str2, String str3, String str4, d<? super y> dVar) throws AlreadyAssociatedException, PartnerScaleAlreadyUsedException, ScaleSingleUserAutoAssignException;

    Object createPublicKey(long j5, long j11, d<? super SharePublicKey> dVar);

    Object deleteAssociation(long j5, long j11, long j12, d<? super y> dVar);

    Object deleteLink(Long l5, d<? super y> dVar);

    Object getAssociationForDevice(long j5, String str, d<? super Associations> dVar);

    Object getAssociations(String str, d<? super Associations> dVar);

    Object getAssociationsByType(int i11, String str, d<? super Associations> dVar);

    Object getDeviceLink(d<? super Link> dVar);

    Object getFirmwareUpgrade(long j5, Integer num, d<? super FirmwareUpgrade> dVar);

    Object getProperties(Long l5, d<? super DeviceProperties> dVar);

    Object getSettings(d<? super DeviceSettings> dVar);

    Object getUserLinks(long j5, Integer num, boolean z5, d<? super Links> dVar);

    Object notifySetup(long j5, int i11, d<? super y> dVar);

    Object resetDevice(long j5, d<? super y> dVar);

    Object setSettings(long j5, int i11, Map<String, ? extends Object> map, d<? super y> dVar);

    Object storeLink(String str, Long l5, d<? super StoreLink> dVar);

    Object updateAssociation(long j5, String str, String str2, d<? super y> dVar);

    Object updateNetwork(long j5, int i11, d<? super y> dVar);

    Object updateProperties(long j5, double d11, double d12, String str, long j11, long j12, String str2, boolean z5, boolean z11, int i11, String str3, Integer num, Boolean bool, d<? super y> dVar);

    DeviceRemoteRepository withSessionIdProvider(e eVar);

    DeviceRemoteRepository withSyncContext(String str);
}
