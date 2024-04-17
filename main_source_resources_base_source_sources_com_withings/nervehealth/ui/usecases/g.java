package com.withings.nervehealth.ui.usecases;

import javax.inject.Inject;
import kotlin.jvm.internal.u;
/* compiled from: GetDeviceMediaUseCase.kt */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final kn.e f42790a;

    /* renamed from: b  reason: collision with root package name */
    private final fl.p f42791b;

    @Inject
    public g(fl.p pVar, kn.e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f42790a = deviceManager;
        this.f42791b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withings.common.device.model.capabilities.DeviceWithVideoMedia.a a() {
        /*
            r7 = this;
            int r0 = com.withings.common.device.model.capabilities.DeviceWithVideoMedia.VideoType.f35228b
            kn.e r0 = r7.f42790a
            java.util.List r0 = r0.m()
            r1 = 0
            if (r0 == 0) goto Lc4
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L12
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto Lc4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 10
            int r3 = kotlin.collections.x.y(r0, r3)
            int r3 = kotlin.collections.s0.h(r3)
            r4 = 16
            if (r3 >= r4) goto L28
            r3 = r4
        L28:
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.withings.device.Device r4 = (com.withings.device.Device) r4
            kotlin.jvm.internal.u.g(r4)
            fl.p r5 = r7.f42791b
            fl.o r4 = r5.g(r4)
            r2.put(r3, r4)
            goto L2f
        L49:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            fl.o r4 = (fl.o) r4
            boolean r4 = r4 instanceof com.withings.common.device.model.capabilities.DeviceWithVideoMedia
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r4, r3)
            goto L56
        L78:
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L8a
            r2 = r1
            goto Lc1
        L8a:
            java.lang.Object r2 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L95
            goto Lc1
        L95:
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            com.withings.device.Device r3 = (com.withings.device.Device) r3
            org.joda.time.DateTime r3 = r3.getAssociationDate()
        La2:
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            com.withings.device.Device r5 = (com.withings.device.Device) r5
            org.joda.time.DateTime r5 = r5.getAssociationDate()
            int r6 = r3.compareTo(r5)
            if (r6 <= 0) goto Lbb
            r2 = r4
            r3 = r5
        Lbb:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto La2
        Lc1:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto Lc5
        Lc4:
            r2 = r1
        Lc5:
            if (r2 == 0) goto Lce
            java.lang.Object r0 = r2.getValue()
            fl.o r0 = (fl.o) r0
            goto Lcf
        Lce:
            r0 = r1
        Lcf:
            boolean r3 = r0 instanceof com.withings.common.device.model.capabilities.DeviceWithVideoMedia
            if (r3 == 0) goto Ld6
            com.withings.common.device.model.capabilities.DeviceWithVideoMedia r0 = (com.withings.common.device.model.capabilities.DeviceWithVideoMedia) r0
            goto Ld7
        Ld6:
            r0 = r1
        Ld7:
            if (r0 == 0) goto Le7
            java.lang.Object r1 = r2.getKey()
            com.withings.device.Device r1 = (com.withings.device.Device) r1
            java.lang.String r1 = r1.getColor()
            com.withings.common.device.model.capabilities.DeviceWithVideoMedia$a r1 = r0.l(r1)
        Le7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.usecases.g.a():com.withings.common.device.model.capabilities.DeviceWithVideoMedia$a");
    }
}
