package com.withings.wiscale2.device.common.ui;

import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.PlatformFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlatformFeatureAggregator.kt */
/* loaded from: classes5.dex */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f53781a;

    public b2(long j5) {
        this.f53781a = j5;
    }

    public final ArrayList a(List platformFeatures) {
        kotlin.jvm.internal.u.j(platformFeatures, "platformFeatures");
        List<PlatformFeature> list = platformFeatures;
        int i11 = 10;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (PlatformFeature platformFeature : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : platformFeature.getOwners()) {
                if (obj instanceof DeviceOwner) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(arrayList2, i11));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                DeviceOwner deviceOwner = (DeviceOwner) it.next();
                int featureId = platformFeature.getFeatureId();
                String name = platformFeature.getName();
                if (name == null) {
                    int featureId2 = platformFeature.getFeatureId();
                    switch (featureId2) {
                        case 1:
                            name = "FEATURE_ID_CE_MEDICAL";
                            break;
                        case 2:
                            name = "FEATURE_ID_APNEA";
                            break;
                        case 3:
                            name = "FEATURE_ID_SPO2_NON_MEDICAL";
                            break;
                        case 4:
                            name = "FEATURE_ID_ECG";
                            break;
                        case 5:
                            name = "FEATURE_ID_SPO2_AUTO_ASLEEP";
                            break;
                        case 6:
                            name = "FEATURE_ID_TEST_WRITE";
                            break;
                        case 7:
                            name = "FEATURE_ID_TEST_READ";
                            break;
                        case 8:
                            name = "FEATURE_ID_BREATHING_DISTURBANCES";
                            break;
                        case 9:
                            name = "FEATURE_ID_RESPIRATORY_SCAN_MONITORING";
                            break;
                        case 10:
                            name = "FEATURE_ID_RESPIRATORY_SCAN";
                            break;
                        case 11:
                            name = "FEATURE_ID_RESPIRATORY_SCAN_SMART";
                            break;
                        case 12:
                            name = "FEATURE_ID_ECG_REQUIRES_REVIEW";
                            break;
                        case 13:
                            name = "FEATURE_ID_PPG_AFIB_NON_MEDICAL";
                            break;
                        case 14:
                            name = "FEATURE_ID_PPG_AFIB_MEDICAL";
                            break;
                        case 15:
                            name = "FEATURE_ID_SPO2_MEDICAL";
                            break;
                        case 16:
                            name = "FEATURE_ID_SPO2_RESPIRATORY_SCAN";
                            break;
                        case 17:
                            name = "FEATURE_ID_PPG_AFIB_MONITORING";
                            break;
                        case 18:
                            name = "FEATURE_ID_NAVIGATION";
                            break;
                        case 19:
                            name = "FEATURE_ID_NOTIFICATION";
                            break;
                        case 20:
                            name = "FEATURE_ID_ACTIVITY";
                            break;
                        case 21:
                            name = "FEATURE_ID_WORKOUT";
                            break;
                        default:
                            name = String.valueOf(featureId2);
                            break;
                    }
                }
                boolean synced = platformFeature.getSynced();
                boolean active = deviceOwner.getActive();
                boolean activable = deviceOwner.getActivable();
                boolean write = deviceOwner.getWrite();
                long modified = deviceOwner.getModified();
                Long startDate = deviceOwner.getStartDate();
                Long endDate = deviceOwner.getEndDate();
                Integer frequency = deviceOwner.getFrequency();
                boolean isTutorialSeen = deviceOwner.isTutorialSeen();
                arrayList3.add(new a(this.f53781a, featureId, name, deviceOwner, synced, active, activable, write, modified, startDate, endDate, frequency, isTutorialSeen));
                platformFeature = platformFeature;
            }
            arrayList.add(arrayList3);
            i11 = 10;
        }
        return kotlin.collections.x.L(arrayList);
    }
}
