package com.withings.weight.ui.usecase;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.withings.weight.android.model.BodyComposition;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
/* loaded from: classes4.dex */
public interface BodyCompositionDescriptionInformation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/ui/usecase/BodyCompositionDescriptionInformation$Limb;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Limb {

        /* renamed from: a  reason: collision with root package name */
        public static final Limb f47800a;

        /* renamed from: b  reason: collision with root package name */
        public static final Limb f47801b;

        /* renamed from: c  reason: collision with root package name */
        public static final Limb f47802c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Limb[] f47803d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation$Limb] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation$Limb] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation$Limb] */
        static {
            ?? r02 = new Enum("TORSO", 0);
            f47800a = r02;
            ?? r12 = new Enum("ARMS", 1);
            f47801b = r12;
            ?? r22 = new Enum("LEGS", 2);
            f47802c = r22;
            Limb[] limbArr = {r02, r12, r22};
            f47803d = limbArr;
            sm0.b.a(limbArr);
        }

        private Limb() {
            throw null;
        }

        public static Limb valueOf(String str) {
            return (Limb) Enum.valueOf(Limb.class, str);
        }

        public static Limb[] values() {
            return (Limb[]) f47803d.clone();
        }
    }

    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class a implements BodyCompositionDescriptionInformation {

        /* renamed from: a  reason: collision with root package name */
        private final Limb f47804a;

        /* renamed from: b  reason: collision with root package name */
        private final BodyComposition.BodyCompositionType f47805b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47806c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47807d;

        /* renamed from: e  reason: collision with root package name */
        private final String f47808e;

        public a(Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, int i11, String firstRangeFormatted, String secondRangeFormatted) {
            u.j(bodyCompositionType, "bodyCompositionType");
            u.j(firstRangeFormatted, "firstRangeFormatted");
            u.j(secondRangeFormatted, "secondRangeFormatted");
            this.f47804a = limb;
            this.f47805b = bodyCompositionType;
            this.f47806c = i11;
            this.f47807d = firstRangeFormatted;
            this.f47808e = secondRangeFormatted;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final int a() {
            return this.f47806c;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final Limb b() {
            return this.f47804a;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final BodyComposition.BodyCompositionType c() {
            return this.f47805b;
        }

        public final String d() {
            return this.f47807d;
        }

        public final String e() {
            return this.f47808e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f47804a == aVar.f47804a && this.f47805b == aVar.f47805b && this.f47806c == aVar.f47806c && u.e(this.f47807d, aVar.f47807d) && u.e(this.f47808e, aVar.f47808e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47805b.hashCode();
            return this.f47808e.hashCode() + defpackage.d.c(this.f47807d, h.a(this.f47806c, (hashCode + (this.f47804a.hashCode() * 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("High(limb=");
            sb2.append(this.f47804a);
            sb2.append(", bodyCompositionType=");
            sb2.append(this.f47805b);
            sb2.append(", populationPercent=");
            sb2.append(this.f47806c);
            sb2.append(", firstRangeFormatted=");
            sb2.append(this.f47807d);
            sb2.append(", secondRangeFormatted=");
            return y1.e(sb2, this.f47808e, ")");
        }
    }

    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class b implements BodyCompositionDescriptionInformation {

        /* renamed from: a  reason: collision with root package name */
        private final Limb f47809a;

        /* renamed from: b  reason: collision with root package name */
        private final BodyComposition.BodyCompositionType f47810b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47811c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47812d;

        public b(Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, int i11, String rangeFormatted) {
            u.j(bodyCompositionType, "bodyCompositionType");
            u.j(rangeFormatted, "rangeFormatted");
            this.f47809a = limb;
            this.f47810b = bodyCompositionType;
            this.f47811c = i11;
            this.f47812d = rangeFormatted;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final int a() {
            return this.f47811c;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final Limb b() {
            return this.f47809a;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final BodyComposition.BodyCompositionType c() {
            return this.f47810b;
        }

        public final String d() {
            return this.f47812d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f47809a == bVar.f47809a && this.f47810b == bVar.f47810b && this.f47811c == bVar.f47811c && u.e(this.f47812d, bVar.f47812d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47810b.hashCode();
            return this.f47812d.hashCode() + h.a(this.f47811c, (hashCode + (this.f47809a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Highest(limb=");
            sb2.append(this.f47809a);
            sb2.append(", bodyCompositionType=");
            sb2.append(this.f47810b);
            sb2.append(", populationPercent=");
            sb2.append(this.f47811c);
            sb2.append(", rangeFormatted=");
            return y1.e(sb2, this.f47812d, ")");
        }
    }

    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class c implements BodyCompositionDescriptionInformation {

        /* renamed from: a  reason: collision with root package name */
        private final Limb f47813a;

        /* renamed from: b  reason: collision with root package name */
        private final BodyComposition.BodyCompositionType f47814b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47815c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47816d;

        /* renamed from: e  reason: collision with root package name */
        private final String f47817e;

        public c(Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, int i11, String firstRangeFormatted, String secondRangeFormatted) {
            u.j(bodyCompositionType, "bodyCompositionType");
            u.j(firstRangeFormatted, "firstRangeFormatted");
            u.j(secondRangeFormatted, "secondRangeFormatted");
            this.f47813a = limb;
            this.f47814b = bodyCompositionType;
            this.f47815c = i11;
            this.f47816d = firstRangeFormatted;
            this.f47817e = secondRangeFormatted;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final int a() {
            return this.f47815c;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final Limb b() {
            return this.f47813a;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final BodyComposition.BodyCompositionType c() {
            return this.f47814b;
        }

        public final String d() {
            return this.f47816d;
        }

        public final String e() {
            return this.f47817e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f47813a == cVar.f47813a && this.f47814b == cVar.f47814b && this.f47815c == cVar.f47815c && u.e(this.f47816d, cVar.f47816d) && u.e(this.f47817e, cVar.f47817e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47814b.hashCode();
            return this.f47817e.hashCode() + defpackage.d.c(this.f47816d, h.a(this.f47815c, (hashCode + (this.f47813a.hashCode() * 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Low(limb=");
            sb2.append(this.f47813a);
            sb2.append(", bodyCompositionType=");
            sb2.append(this.f47814b);
            sb2.append(", populationPercent=");
            sb2.append(this.f47815c);
            sb2.append(", firstRangeFormatted=");
            sb2.append(this.f47816d);
            sb2.append(", secondRangeFormatted=");
            return y1.e(sb2, this.f47817e, ")");
        }
    }

    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class d implements BodyCompositionDescriptionInformation {

        /* renamed from: a  reason: collision with root package name */
        private final Limb f47818a;

        /* renamed from: b  reason: collision with root package name */
        private final BodyComposition.BodyCompositionType f47819b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47820c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47821d;

        public d(Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, int i11, String rangeFormatted) {
            u.j(bodyCompositionType, "bodyCompositionType");
            u.j(rangeFormatted, "rangeFormatted");
            this.f47818a = limb;
            this.f47819b = bodyCompositionType;
            this.f47820c = i11;
            this.f47821d = rangeFormatted;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final int a() {
            return this.f47820c;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final Limb b() {
            return this.f47818a;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final BodyComposition.BodyCompositionType c() {
            return this.f47819b;
        }

        public final String d() {
            return this.f47821d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f47818a == dVar.f47818a && this.f47819b == dVar.f47819b && this.f47820c == dVar.f47820c && u.e(this.f47821d, dVar.f47821d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47819b.hashCode();
            return this.f47821d.hashCode() + h.a(this.f47820c, (hashCode + (this.f47818a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Lowest(limb=");
            sb2.append(this.f47818a);
            sb2.append(", bodyCompositionType=");
            sb2.append(this.f47819b);
            sb2.append(", populationPercent=");
            sb2.append(this.f47820c);
            sb2.append(", rangeFormatted=");
            return y1.e(sb2, this.f47821d, ")");
        }
    }

    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class e implements BodyCompositionDescriptionInformation {

        /* renamed from: a  reason: collision with root package name */
        private final Limb f47822a;

        /* renamed from: b  reason: collision with root package name */
        private final BodyComposition.BodyCompositionType f47823b;

        /* renamed from: c  reason: collision with root package name */
        private final int f47824c;

        /* renamed from: d  reason: collision with root package name */
        private final String f47825d;

        /* renamed from: e  reason: collision with root package name */
        private final String f47826e;

        public e(Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, int i11, String firstRangeFormatted, String secondRangeFormatted) {
            u.j(bodyCompositionType, "bodyCompositionType");
            u.j(firstRangeFormatted, "firstRangeFormatted");
            u.j(secondRangeFormatted, "secondRangeFormatted");
            this.f47822a = limb;
            this.f47823b = bodyCompositionType;
            this.f47824c = i11;
            this.f47825d = firstRangeFormatted;
            this.f47826e = secondRangeFormatted;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final int a() {
            return this.f47824c;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final Limb b() {
            return this.f47822a;
        }

        @Override // com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation
        public final BodyComposition.BodyCompositionType c() {
            return this.f47823b;
        }

        public final String d() {
            return this.f47825d;
        }

        public final String e() {
            return this.f47826e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f47822a == eVar.f47822a && this.f47823b == eVar.f47823b && this.f47824c == eVar.f47824c && u.e(this.f47825d, eVar.f47825d) && u.e(this.f47826e, eVar.f47826e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f47823b.hashCode();
            return this.f47826e.hashCode() + defpackage.d.c(this.f47825d, h.a(this.f47824c, (hashCode + (this.f47822a.hashCode() * 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Middle(limb=");
            sb2.append(this.f47822a);
            sb2.append(", bodyCompositionType=");
            sb2.append(this.f47823b);
            sb2.append(", populationPercent=");
            sb2.append(this.f47824c);
            sb2.append(", firstRangeFormatted=");
            sb2.append(this.f47825d);
            sb2.append(", secondRangeFormatted=");
            return y1.e(sb2, this.f47826e, ")");
        }
    }

    int a();

    Limb b();

    BodyComposition.BodyCompositionType c();
}
