package com.withings.common.compose.component;

import com.withings.wiscale2.C1987R;
/* compiled from: GridSelector.kt */
/* loaded from: classes3.dex */
public interface q1 {

    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class a implements q1 {

        /* renamed from: a  reason: collision with root package name */
        private final int f34557a;

        /* renamed from: b  reason: collision with root package name */
        private final int f34558b;

        /* renamed from: c  reason: collision with root package name */
        private final int f34559c;

        public a(int i11, int i12, int i13) {
            this.f34557a = i11;
            this.f34558b = i12;
            this.f34559c = i13;
        }

        @Override // com.withings.common.compose.component.q1
        public final int a() {
            return this.f34558b;
        }

        public final int b() {
            return this.f34559c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34557a == aVar.f34557a && this.f34558b == aVar.f34558b && this.f34559c == aVar.f34559c) {
                return true;
            }
            return false;
        }

        @Override // com.withings.common.compose.component.q1
        public final int getId() {
            return this.f34557a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f34559c) + androidx.appcompat.app.h.a(this.f34558b, Integer.hashCode(this.f34557a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WithIcon(id=");
            sb2.append(this.f34557a);
            sb2.append(", text=");
            sb2.append(this.f34558b);
            sb2.append(", icon=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f34559c, ")");
        }
    }

    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class b implements q1 {

        /* renamed from: a  reason: collision with root package name */
        private final int f34560a;

        /* renamed from: b  reason: collision with root package name */
        private final int f34561b;

        /* renamed from: c  reason: collision with root package name */
        private final String f34562c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f34563d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f34564e;

        public b(int i11, int i12, String str) {
            Integer valueOf = Integer.valueOf((int) C1987R.color.categoryMindfulnessIcon);
            Integer valueOf2 = Integer.valueOf((int) C1987R.color.categoryMindfulnessBackgroundCard);
            this.f34560a = i11;
            this.f34561b = i12;
            this.f34562c = str;
            this.f34563d = valueOf;
            this.f34564e = valueOf2;
        }

        @Override // com.withings.common.compose.component.q1
        public final int a() {
            return this.f34561b;
        }

        public final Integer b() {
            return this.f34564e;
        }

        public final Integer c() {
            return this.f34563d;
        }

        public final String d() {
            return this.f34562c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34560a == bVar.f34560a && this.f34561b == bVar.f34561b && kotlin.jvm.internal.u.e(this.f34562c, bVar.f34562c) && kotlin.jvm.internal.u.e(this.f34563d, bVar.f34563d) && kotlin.jvm.internal.u.e(this.f34564e, bVar.f34564e)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.common.compose.component.q1
        public final int getId() {
            return this.f34560a;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int a11 = androidx.appcompat.app.h.a(this.f34561b, Integer.hashCode(this.f34560a) * 31, 31);
            int i11 = 0;
            String str = this.f34562c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (a11 + hashCode) * 31;
            Integer num = this.f34563d;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Integer num2 = this.f34564e;
            if (num2 != null) {
                i11 = num2.hashCode();
            }
            return i13 + i11;
        }

        public final String toString() {
            return "WithIconId(id=" + this.f34560a + ", text=" + this.f34561b + ", iconId=" + this.f34562c + ", iconColorId=" + this.f34563d + ", backgroundColorId=" + this.f34564e + ")";
        }
    }

    int a();

    int getId();
}
