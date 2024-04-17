package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f55569a = 250;

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class a implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f55570a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ym0.l lVar) {
            this.f55570a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f55570a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f55570a;
        }

        public final int hashCode() {
            return this.f55570a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55570a.invoke(obj);
        }
    }
}
