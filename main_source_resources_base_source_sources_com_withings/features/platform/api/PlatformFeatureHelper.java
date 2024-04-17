package com.withings.features.platform.api;

import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* compiled from: PlatformFeatureHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u00042\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper;", "", "()V", "AfibState", "Companion", "EcgState", "IrregularHeartBeatState", "RespiratoryScanState", "SpO2FeatureState", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformFeatureHelper {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$AfibState;", "", "(Ljava/lang/String;I)V", "NotAvailable", "NotActivated", "Off", "On", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AfibState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AfibState[] $VALUES;
        public static final AfibState NotAvailable = new AfibState("NotAvailable", 0);
        public static final AfibState NotActivated = new AfibState("NotActivated", 1);
        public static final AfibState Off = new AfibState("Off", 2);
        public static final AfibState On = new AfibState("On", 3);

        private static final /* synthetic */ AfibState[] $values() {
            return new AfibState[]{NotAvailable, NotActivated, Off, On};
        }

        static {
            AfibState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AfibState(String str, int i11) {
        }

        public static a<AfibState> getEntries() {
            return $ENTRIES;
        }

        public static AfibState valueOf(String str) {
            return (AfibState) Enum.valueOf(AfibState.class, str);
        }

        public static AfibState[] values() {
            return (AfibState[]) $VALUES.clone();
        }
    }

    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u001b\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J&\u0010\u001c\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0002J&\u0010\u001d\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\u001e\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\u001f\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010 \u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J$\u0010!\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ&\u0010\"\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010#\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006$"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$Companion;", "", "()V", "getAfibFeatureState", "Lcom/withings/features/platform/api/PlatformFeatureHelper$AfibState;", "platformFeatures", "", "Lcom/withings/features/platform/model/PlatformFeature;", "deviceId", "", "getEcgFeatureState", "Lcom/withings/features/platform/api/PlatformFeatureHelper$EcgState;", "getIrregularHeartBeatFeatureState", "Lcom/withings/features/platform/api/PlatformFeatureHelper$IrregularHeartBeatState;", "getRespiratoryScanState", "Lcom/withings/features/platform/api/PlatformFeatureHelper$RespiratoryScanState;", "getSpO2FeatureState", "Lcom/withings/features/platform/api/PlatformFeatureHelper$SpO2FeatureState;", "spo2Features", "hasDateSet", "", "owner", "Lcom/withings/features/platform/model/Owner;", "hasFeature", "featureId", "", "hasNoDateSet", "hasNoSpo2Feature", "isActivatedForFeature", "isActivatedForFeatureWithoutDate", "isActivatedForSpo2FeatureWithoutDate", "isActiveForSpo2AndNotActiveForSpo2Auto", "isActiveForSpo2AndSpo2AutoWithoutDate", "isFeatureEnabled", "isNotActivatedForFeature", "isNotActivatedForSpo2", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final boolean hasDateSet(Owner owner) {
            if (owner.getStartDate() != null && owner.getEndDate() != null) {
                return true;
            }
            return false;
        }

        private final boolean hasFeature(List<PlatformFeature> list, int i11, long j5) {
            DeviceOwner deviceOwner;
            Long deviceId;
            List<PlatformFeature> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (PlatformFeature platformFeature : list2) {
                if (platformFeature.getFeatureId() == i11) {
                    List<Owner> owners = platformFeature.getOwners();
                    if (!(owners instanceof Collection) || !owners.isEmpty()) {
                        for (Owner owner : owners) {
                            if (owner instanceof DeviceOwner) {
                                deviceOwner = (DeviceOwner) owner;
                            } else {
                                deviceOwner = null;
                            }
                            if (deviceOwner != null && (deviceId = deviceOwner.getDeviceId()) != null && deviceId.longValue() == j5) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }

        private final boolean hasNoDateSet(Owner owner) {
            if (owner.getStartDate() == null && owner.getEndDate() == null) {
                return true;
            }
            return false;
        }

        private final boolean hasNoSpo2Feature(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (PlatformFeature platformFeature : list2) {
                if (x.W(15, 3).contains(Integer.valueOf(platformFeature.getFeatureId()))) {
                    return false;
                }
            }
            return true;
        }

        private final boolean isActivatedForFeature(List<PlatformFeature> list, int i11, long j5) {
            List<PlatformFeature> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (PlatformFeature platformFeature : list2) {
                if (platformFeature.getFeatureId() == i11) {
                    List<Owner> owners = platformFeature.getOwners();
                    if (!(owners instanceof Collection) || !owners.isEmpty()) {
                        for (Owner owner : owners) {
                            if (PlatformFeatureKt.isActivatedForDevice(platformFeature, j5) && PlatformFeatureHelper.Companion.hasNoDateSet(owner)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }

        private final boolean isActivatedForFeatureWithoutDate(List<PlatformFeature> list, int i11, long j5) {
            List<PlatformFeature> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (PlatformFeature platformFeature : list2) {
                if (platformFeature.getFeatureId() == i11) {
                    List<Owner> owners = platformFeature.getOwners();
                    if (!(owners instanceof Collection) || !owners.isEmpty()) {
                        for (Owner owner : owners) {
                            if (PlatformFeatureKt.isActivatedForDevice(platformFeature, j5) && PlatformFeatureHelper.Companion.hasNoDateSet(owner)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }

        private final boolean isActivatedForSpo2FeatureWithoutDate(List<PlatformFeature> list, long j5) {
            if (!isActivatedForFeatureWithoutDate(list, 15, j5) && !isActivatedForFeatureWithoutDate(list, 3, j5)) {
                return false;
            }
            return true;
        }

        private final boolean isActiveForSpo2AndNotActiveForSpo2Auto(List<PlatformFeature> list, long j5) {
            if (isActivatedForSpo2FeatureWithoutDate(list, j5) && isNotActivatedForFeature(list, 5, j5)) {
                return true;
            }
            return false;
        }

        private final boolean isActiveForSpo2AndSpo2AutoWithoutDate(List<PlatformFeature> list, long j5) {
            if (isActivatedForSpo2FeatureWithoutDate(list, j5) && isActivatedForFeatureWithoutDate(list, 5, j5)) {
                return true;
            }
            return false;
        }

        private final boolean isNotActivatedForFeature(List<PlatformFeature> list, int i11, long j5) {
            List<PlatformFeature> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (PlatformFeature platformFeature : list2) {
                if (platformFeature.getFeatureId() == i11) {
                    List<Owner> owners = platformFeature.getOwners();
                    if (!(owners instanceof Collection) || !owners.isEmpty()) {
                        for (Owner owner : owners) {
                            if (PlatformFeatureKt.isActivatedForDevice(platformFeature, j5) && PlatformFeatureHelper.Companion.hasNoDateSet(owner)) {
                                return false;
                            }
                        }
                        continue;
                    }
                }
            }
            return true;
        }

        private final boolean isNotActivatedForSpo2(List<PlatformFeature> list, long j5) {
            if (isNotActivatedForFeature(list, 15, j5) && isNotActivatedForFeature(list, 3, j5)) {
                return true;
            }
            return false;
        }

        public final AfibState getAfibFeatureState(List<PlatformFeature> platformFeatures, long j5) {
            u.j(platformFeatures, "platformFeatures");
            List<PlatformFeature> list = platformFeatures;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PlatformFeature platformFeature : list) {
                    if (platformFeature.getFeatureId() == 14) {
                        if (isNotActivatedForFeature(platformFeatures, 14, j5)) {
                            return AfibState.NotActivated;
                        }
                        if (isActivatedForFeature(platformFeatures, 17, j5)) {
                            return AfibState.On;
                        }
                        return AfibState.Off;
                    }
                }
            }
            return AfibState.NotAvailable;
        }

        public final EcgState getEcgFeatureState(List<PlatformFeature> platformFeatures, long j5) {
            u.j(platformFeatures, "platformFeatures");
            if (isActivatedForFeature(platformFeatures, 4, j5)) {
                if (hasFeature(platformFeatures, 12, j5)) {
                    return EcgState.ActivatedButMissingFirstMeasurementForUs;
                }
                return EcgState.On;
            }
            return EcgState.NotActivated;
        }

        public final IrregularHeartBeatState getIrregularHeartBeatFeatureState(List<PlatformFeature> platformFeatures, long j5) {
            u.j(platformFeatures, "platformFeatures");
            List<PlatformFeature> list = platformFeatures;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PlatformFeature platformFeature : list) {
                    if (platformFeature.getFeatureId() == 13) {
                        if (isNotActivatedForFeature(platformFeatures, 13, j5)) {
                            return IrregularHeartBeatState.NotActivated;
                        }
                        if (isActivatedForFeature(platformFeatures, 17, j5)) {
                            return IrregularHeartBeatState.MonitoringOn;
                        }
                        return IrregularHeartBeatState.MonitoringOff;
                    }
                }
            }
            return IrregularHeartBeatState.NotAvailable;
        }

        public final RespiratoryScanState getRespiratoryScanState(List<PlatformFeature> platformFeatures, long j5) {
            Object obj;
            Object obj2;
            boolean z5;
            Object obj3;
            boolean z11;
            u.j(platformFeatures, "platformFeatures");
            List<PlatformFeature> list = platformFeatures;
            Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((PlatformFeature) obj2).getFeatureId() == 10) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj2;
            boolean z12 = false;
            if (platformFeature != null) {
                z5 = PlatformFeatureKt.isActivatedForDevice(platformFeature, j5);
            } else {
                z5 = false;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if (((PlatformFeature) obj3).getFeatureId() == 9) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            PlatformFeature platformFeature2 = (PlatformFeature) obj3;
            if (platformFeature2 != null) {
                z11 = PlatformFeatureKt.isActivatedForDevice(platformFeature2, j5);
            } else {
                z11 = false;
            }
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((PlatformFeature) next).getFeatureId() == 11) {
                    obj = next;
                    break;
                }
            }
            PlatformFeature platformFeature3 = (PlatformFeature) obj;
            if (platformFeature3 != null) {
                z12 = PlatformFeatureKt.isActivatedForDevice(platformFeature3, j5);
            }
            if (!z5) {
                return RespiratoryScanState.NotActivated;
            }
            if (!z11) {
                return RespiratoryScanState.Off;
            }
            if (z12) {
                return RespiratoryScanState.Auto;
            }
            return RespiratoryScanState.AlwaysOn;
        }

        public final SpO2FeatureState getSpO2FeatureState(List<PlatformFeature> spo2Features, long j5) {
            u.j(spo2Features, "spo2Features");
            if (hasNoSpo2Feature(spo2Features)) {
                return null;
            }
            if (isNotActivatedForSpo2(spo2Features, j5)) {
                return SpO2FeatureState.NotActivated;
            }
            if (isActiveForSpo2AndNotActiveForSpo2Auto(spo2Features, j5)) {
                return SpO2FeatureState.OnDemand;
            }
            if (isActiveForSpo2AndSpo2AutoWithoutDate(spo2Features, j5)) {
                return SpO2FeatureState.MonitorDuringSleep;
            }
            List<PlatformFeature> list = spo2Features;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PlatformFeature platformFeature : list) {
                    if (PlatformFeatureKt.isActivatedForDevice(platformFeature, j5)) {
                        return SpO2FeatureState.Accepted;
                    }
                }
            }
            return SpO2FeatureState.NotActivated;
        }

        public final boolean isFeatureEnabled(int i11, List<PlatformFeature> platformFeatures, long j5) {
            Object obj;
            u.j(platformFeatures, "platformFeatures");
            Iterator<T> it = platformFeatures.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PlatformFeature) obj).getFeatureId() == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            if (platformFeature != null) {
                return PlatformFeatureKt.isEnabledForDevice(platformFeature, j5);
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$EcgState;", "", "(Ljava/lang/String;I)V", "NotActivated", "ActivatedButMissingFirstMeasurementForUs", "On", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class EcgState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EcgState[] $VALUES;
        public static final EcgState NotActivated = new EcgState("NotActivated", 0);
        public static final EcgState ActivatedButMissingFirstMeasurementForUs = new EcgState("ActivatedButMissingFirstMeasurementForUs", 1);
        public static final EcgState On = new EcgState("On", 2);

        private static final /* synthetic */ EcgState[] $values() {
            return new EcgState[]{NotActivated, ActivatedButMissingFirstMeasurementForUs, On};
        }

        static {
            EcgState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EcgState(String str, int i11) {
        }

        public static a<EcgState> getEntries() {
            return $ENTRIES;
        }

        public static EcgState valueOf(String str) {
            return (EcgState) Enum.valueOf(EcgState.class, str);
        }

        public static EcgState[] values() {
            return (EcgState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$IrregularHeartBeatState;", "", "(Ljava/lang/String;I)V", "NotAvailable", "NotActivated", "MonitoringOff", "MonitoringOn", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class IrregularHeartBeatState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IrregularHeartBeatState[] $VALUES;
        public static final IrregularHeartBeatState NotAvailable = new IrregularHeartBeatState("NotAvailable", 0);
        public static final IrregularHeartBeatState NotActivated = new IrregularHeartBeatState("NotActivated", 1);
        public static final IrregularHeartBeatState MonitoringOff = new IrregularHeartBeatState("MonitoringOff", 2);
        public static final IrregularHeartBeatState MonitoringOn = new IrregularHeartBeatState("MonitoringOn", 3);

        private static final /* synthetic */ IrregularHeartBeatState[] $values() {
            return new IrregularHeartBeatState[]{NotAvailable, NotActivated, MonitoringOff, MonitoringOn};
        }

        static {
            IrregularHeartBeatState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IrregularHeartBeatState(String str, int i11) {
        }

        public static a<IrregularHeartBeatState> getEntries() {
            return $ENTRIES;
        }

        public static IrregularHeartBeatState valueOf(String str) {
            return (IrregularHeartBeatState) Enum.valueOf(IrregularHeartBeatState.class, str);
        }

        public static IrregularHeartBeatState[] values() {
            return (IrregularHeartBeatState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$RespiratoryScanState;", "", "(Ljava/lang/String;I)V", "NotActivated", "Off", "Auto", "AlwaysOn", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RespiratoryScanState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RespiratoryScanState[] $VALUES;
        public static final RespiratoryScanState NotActivated = new RespiratoryScanState("NotActivated", 0);
        public static final RespiratoryScanState Off = new RespiratoryScanState("Off", 1);
        public static final RespiratoryScanState Auto = new RespiratoryScanState("Auto", 2);
        public static final RespiratoryScanState AlwaysOn = new RespiratoryScanState("AlwaysOn", 3);

        private static final /* synthetic */ RespiratoryScanState[] $values() {
            return new RespiratoryScanState[]{NotActivated, Off, Auto, AlwaysOn};
        }

        static {
            RespiratoryScanState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RespiratoryScanState(String str, int i11) {
        }

        public static a<RespiratoryScanState> getEntries() {
            return $ENTRIES;
        }

        public static RespiratoryScanState valueOf(String str) {
            return (RespiratoryScanState) Enum.valueOf(RespiratoryScanState.class, str);
        }

        public static RespiratoryScanState[] values() {
            return (RespiratoryScanState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlatformFeatureHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureHelper$SpO2FeatureState;", "", "(Ljava/lang/String;I)V", "NotActivated", "Accepted", "OnDemand", "MonitorDuringSleep", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SpO2FeatureState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SpO2FeatureState[] $VALUES;
        public static final SpO2FeatureState NotActivated = new SpO2FeatureState("NotActivated", 0);
        public static final SpO2FeatureState Accepted = new SpO2FeatureState("Accepted", 1);
        public static final SpO2FeatureState OnDemand = new SpO2FeatureState("OnDemand", 2);
        public static final SpO2FeatureState MonitorDuringSleep = new SpO2FeatureState("MonitorDuringSleep", 3);

        private static final /* synthetic */ SpO2FeatureState[] $values() {
            return new SpO2FeatureState[]{NotActivated, Accepted, OnDemand, MonitorDuringSleep};
        }

        static {
            SpO2FeatureState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SpO2FeatureState(String str, int i11) {
        }

        public static a<SpO2FeatureState> getEntries() {
            return $ENTRIES;
        }

        public static SpO2FeatureState valueOf(String str) {
            return (SpO2FeatureState) Enum.valueOf(SpO2FeatureState.class, str);
        }

        public static SpO2FeatureState[] values() {
            return (SpO2FeatureState[]) $VALUES.clone();
        }
    }
}
