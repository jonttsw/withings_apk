package com.withings.wiscale2.legacyprograms;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.DeviceDomain;
import com.withings.programs.model.program.EligibilityDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "", "isEligible", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)Z", "hasEligibleUrl", "hasAnyRequiredDevice", "Lkn/e;", "deviceManager", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "ownRequiredDevices", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;Lkn/e;Lcom/withings/user/User;)Z", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramJoinerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasAnyRequiredDevice(ProgramDomain.LegacyDomain legacyDomain) {
        List<DeviceDomain> devices = legacyDomain.getSpecifics().getDevices();
        if (devices == null) {
            return false;
        }
        List<DeviceDomain> list = devices;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (DeviceDomain deviceDomain : list) {
            if (deviceDomain.getRequired()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEligibleUrl(ProgramDomain.LegacyDomain legacyDomain) {
        String str;
        EligibilityDomain eligibility = legacyDomain.getEligibility();
        if (eligibility != null) {
            str = eligibility.getUrl();
        } else {
            str = null;
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isEligible(ProgramDomain.LegacyDomain legacyDomain) {
        EligibilityDomain eligibility = legacyDomain.getEligibility();
        if (eligibility != null) {
            return eligibility.getStatus();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ownRequiredDevices(ProgramDomain.LegacyDomain legacyDomain, kn.e eVar, User user) {
        List<Device> i11 = eVar.i(user.q());
        List<DeviceDomain> devices = legacyDomain.getSpecifics().getDevices();
        if (devices == null) {
            return false;
        }
        List<DeviceDomain> list = devices;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (DeviceDomain deviceDomain : list) {
            if (deviceDomain.getRequired()) {
                u.g(i11);
                List<Device> list2 = i11;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (Device device : list2) {
                        if (deviceDomain.getModel() == device.getModelId()) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
