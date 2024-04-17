package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import kotlin.Metadata;
/* compiled from: SetDeltaConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SetDeltaConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetDeltaConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final ActivityAggregateManager f50749f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f50750g;

    /* compiled from: SetDeltaConversation.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f50751a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50752b;

        /* renamed from: c  reason: collision with root package name */
        private final int f50753c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f50754d;

        public a(int i11, int i12, int i13, Integer num) {
            this.f50751a = i11;
            this.f50752b = i12;
            this.f50753c = i13;
            this.f50754d = num;
        }

        public final int a() {
            return this.f50753c;
        }

        public final int b() {
            return this.f50752b;
        }

        public final Integer c() {
            return this.f50754d;
        }

        public final int d() {
            return this.f50751a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f50751a == aVar.f50751a && this.f50752b == aVar.f50752b && this.f50753c == aVar.f50753c && kotlin.jvm.internal.u.e(this.f50754d, aVar.f50754d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a11 = androidx.appcompat.app.h.a(this.f50753c, androidx.appcompat.app.h.a(this.f50752b, Integer.hashCode(this.f50751a) * 31, 31), 31);
            Integer num = this.f50754d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return a11 + hashCode;
        }

        public final String toString() {
            return "DeltaValues(steps=" + this.f50751a + ", distance=" + this.f50752b + ", calories=" + this.f50753c + ", elevation=" + this.f50754d + ")";
        }
    }

    /* compiled from: SetDeltaConversation.kt */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f50755a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50756b;

        /* renamed from: c  reason: collision with root package name */
        private final int f50757c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f50758d;

        public b(int i11, int i12, int i13, Integer num) {
            this.f50755a = i11;
            this.f50756b = i12;
            this.f50757c = i13;
            this.f50758d = num;
        }

        public final int a() {
            return this.f50757c;
        }

        public final int b() {
            return this.f50756b;
        }

        public final Integer c() {
            return this.f50758d;
        }

        public final int d() {
            return this.f50755a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f50755a == bVar.f50755a && this.f50756b == bVar.f50756b && this.f50757c == bVar.f50757c && kotlin.jvm.internal.u.e(this.f50758d, bVar.f50758d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a11 = androidx.appcompat.app.h.a(this.f50757c, androidx.appcompat.app.h.a(this.f50756b, Integer.hashCode(this.f50755a) * 31, 31), 31);
            Integer num = this.f50758d;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return a11 + hashCode;
        }

        public final String toString() {
            return "DeviceStoredData(steps=" + this.f50755a + ", distance=" + this.f50756b + ", calories=" + this.f50757c + ", elevation=" + this.f50758d + ")";
        }
    }

    public SetDeltaConversation(ActivityAggregateManager activityAggregateManager, kn.e deviceManager) {
        kotlin.jvm.internal.u.j(activityAggregateManager, "activityAggregateManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f50749f = activityAggregateManager;
        this.f50750g = deviceManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (hn.a.g(r6) != false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r7v13, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.conversation.SetDeltaConversation.D():void");
    }
}
