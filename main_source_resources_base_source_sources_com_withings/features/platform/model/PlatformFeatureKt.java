package com.withings.features.platform.model;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0002\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\b\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004\u001a\u001a\u0010\u0014\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u0012\u0010\u0016\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u0014\u0010\u0017\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u001a\u001a\u0010\u0017\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u0012\u0010\u0018\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004\u001a\u0014\u0010\u0019\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004\u001a\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\u001b"}, d2 = {"getAccount", "Lcom/withings/features/platform/model/AccountOwner;", "Lcom/withings/features/platform/model/PlatformFeature;", "accountId", "", "(Lcom/withings/features/platform/model/PlatformFeature;Ljava/lang/Long;)Lcom/withings/features/platform/model/AccountOwner;", "getActiveOwners", "", "Lcom/withings/features/platform/model/Owner;", "getDevice", "Lcom/withings/features/platform/model/DeviceOwner;", "deviceId", "(Lcom/withings/features/platform/model/PlatformFeature;Ljava/lang/Long;)Lcom/withings/features/platform/model/DeviceOwner;", "getEndDateTime", "Lorg/joda/time/DateTime;", "getStartDateTime", "isActivatedForDevice", "", "isActivatedForUser", NavigationArguments.USER_ID, "isActivatedForUserOrDevice", "isDeviceEligible", "isEnabledForDevice", "isTutoSeenForDevice", "isUserEligible", "ownerFor", "Lcom/withings/features/platform/model/UserOwner;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformFeatureKt {
    public static final AccountOwner getAccount(PlatformFeature platformFeature, Long l5) {
        u.j(platformFeature, "<this>");
        Iterator it = x.F(platformFeature.getOwners(), AccountOwner.class).iterator();
        while (it.hasNext()) {
            AccountOwner accountOwner = (AccountOwner) it.next();
            if (u.e(accountOwner.getAccountId(), l5)) {
                return accountOwner;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final List<Owner> getActiveOwners(PlatformFeature platformFeature) {
        u.j(platformFeature, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : platformFeature.getOwners()) {
            if (((Owner) obj).getActive()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final DeviceOwner getDevice(PlatformFeature platformFeature, Long l5) {
        u.j(platformFeature, "<this>");
        Iterator it = x.F(platformFeature.getOwners(), DeviceOwner.class).iterator();
        while (it.hasNext()) {
            DeviceOwner deviceOwner = (DeviceOwner) it.next();
            if (u.e(deviceOwner.getDeviceId(), l5)) {
                return deviceOwner;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final DateTime getEndDateTime(Owner owner) {
        long j5;
        u.j(owner, "<this>");
        Long endDate = owner.getEndDate();
        if (endDate != null) {
            j5 = endDate.longValue();
        } else {
            j5 = 0;
        }
        return new DateTime(j5 * 1000);
    }

    public static final DateTime getStartDateTime(Owner owner) {
        long j5;
        u.j(owner, "<this>");
        Long startDate = owner.getStartDate();
        if (startDate != null) {
            j5 = startDate.longValue();
        } else {
            j5 = 0;
        }
        return new DateTime(j5 * 1000);
    }

    public static final boolean isActivatedForDevice(PlatformFeature platformFeature, long j5) {
        DeviceOwner deviceOwner;
        Long deviceId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
        for (Owner owner : owners) {
            if (owner instanceof DeviceOwner) {
                deviceOwner = (DeviceOwner) owner;
            } else {
                deviceOwner = null;
            }
            if (deviceOwner != null && (deviceId = deviceOwner.getDeviceId()) != null && deviceId.longValue() == j5 && owner.getActive()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isActivatedForUser(PlatformFeature platformFeature, long j5) {
        UserOwner userOwner;
        Long userId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
        for (Owner owner : owners) {
            if (owner instanceof UserOwner) {
                userOwner = (UserOwner) owner;
            } else {
                userOwner = null;
            }
            if (userOwner != null && (userId = userOwner.getUserId()) != null && userId.longValue() == j5 && owner.getActive()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isActivatedForUserOrDevice(PlatformFeature platformFeature, long j5, long j11) {
        Object obj;
        Long deviceId;
        UserOwner userOwner;
        Long userId;
        Long deviceId2;
        u.j(platformFeature, "<this>");
        Iterator<T> it = platformFeature.getOwners().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Owner owner = (Owner) obj;
                if ((owner instanceof UserOwner) && (userId = (userOwner = (UserOwner) owner).getUserId()) != null && userId.longValue() == j11 && (deviceId2 = userOwner.getDeviceId()) != null && deviceId2.longValue() == j5) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Owner owner2 = (Owner) obj;
        if (owner2 != null) {
            return owner2.getActive();
        }
        List<Owner> owners = platformFeature.getOwners();
        if (!(owners instanceof Collection) || !owners.isEmpty()) {
            for (Owner owner3 : owners) {
                if ((owner3 instanceof DeviceOwner) && (deviceId = ((DeviceOwner) owner3).getDeviceId()) != null && deviceId.longValue() == j5 && owner3.getActive()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isDeviceEligible(PlatformFeature platformFeature, long j5) {
        DeviceOwner deviceOwner;
        Long deviceId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
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
        return false;
    }

    public static final boolean isEnabledForDevice(PlatformFeature platformFeature, long j5) {
        DeviceOwner deviceOwner;
        Long deviceId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
        for (Owner owner : owners) {
            if (owner instanceof DeviceOwner) {
                deviceOwner = (DeviceOwner) owner;
            } else {
                deviceOwner = null;
            }
            if (deviceOwner != null && (deviceId = deviceOwner.getDeviceId()) != null && deviceId.longValue() == j5 && owner.getWrite()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isTutoSeenForDevice(PlatformFeature platformFeature, long j5) {
        Long deviceId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
        for (Owner owner : owners) {
            DeviceOwner deviceOwner = owner instanceof DeviceOwner ? (DeviceOwner) owner : null;
            if (deviceOwner != null && (deviceId = deviceOwner.getDeviceId()) != null && deviceId.longValue() == j5 && owner.isTutorialSeen()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUserEligible(PlatformFeature platformFeature, long j5) {
        UserOwner userOwner;
        Long userId;
        u.j(platformFeature, "<this>");
        List<Owner> owners = platformFeature.getOwners();
        if ((owners instanceof Collection) && owners.isEmpty()) {
            return false;
        }
        for (Owner owner : owners) {
            if (owner instanceof UserOwner) {
                userOwner = (UserOwner) owner;
            } else {
                userOwner = null;
            }
            if (userOwner != null && (userId = userOwner.getUserId()) != null && userId.longValue() == j5) {
                return true;
            }
        }
        return false;
    }

    public static final UserOwner ownerFor(PlatformFeature platformFeature, long j5, long j11) {
        Object obj;
        UserOwner userOwner;
        Long userId;
        Long deviceId;
        u.j(platformFeature, "<this>");
        Iterator<T> it = platformFeature.getOwners().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Owner owner = (Owner) obj;
            if ((owner instanceof UserOwner) && (userId = (userOwner = (UserOwner) owner).getUserId()) != null && userId.longValue() == j5 && (deviceId = userOwner.getDeviceId()) != null && deviceId.longValue() == j11) {
                break;
            }
        }
        if (obj instanceof UserOwner) {
            return (UserOwner) obj;
        }
        return null;
    }

    public static final DeviceOwner ownerFor(PlatformFeature platformFeature, long j5) {
        Object obj;
        Long deviceId;
        u.j(platformFeature, "<this>");
        Iterator<T> it = platformFeature.getOwners().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Owner owner = (Owner) obj;
            if ((owner instanceof DeviceOwner) && (deviceId = ((DeviceOwner) owner).getDeviceId()) != null && deviceId.longValue() == j5) {
                break;
            }
        }
        if (obj instanceof DeviceOwner) {
            return (DeviceOwner) obj;
        }
        return null;
    }

    public static final boolean isTutoSeenForDevice(PlatformFeature platformFeature, long j5, long j11) {
        u.j(platformFeature, "<this>");
        UserOwner ownerFor = ownerFor(platformFeature, j5, j11);
        if (ownerFor == null || !ownerFor.isTutorialSeen()) {
            DeviceOwner ownerFor2 = ownerFor(platformFeature, j11);
            return ownerFor2 != null && ownerFor2.isTutorialSeen();
        }
        return true;
    }
}
