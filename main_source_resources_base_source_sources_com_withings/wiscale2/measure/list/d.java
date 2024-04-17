package com.withings.wiscale2.measure.list;

import androidx.camera.core.y1;
import com.withings.library.measure.MeasuresGroup;
import java.util.List;
/* compiled from: ListItem.kt */
/* loaded from: classes5.dex */
public abstract class d {

    /* compiled from: ListItem.kt */
    /* loaded from: classes5.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final List<MeasuresGroup> f58532a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends MeasuresGroup> measureGroups) {
            super(0);
            kotlin.jvm.internal.u.j(measureGroups, "measureGroups");
            this.f58532a = measureGroups;
        }

        public final List<MeasuresGroup> a() {
            return this.f58532a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f58532a, ((a) obj).f58532a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f58532a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("DebugMeasureItem(measureGroups="), this.f58532a, ")");
        }
    }

    /* compiled from: ListItem.kt */
    /* loaded from: classes5.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f58533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String title) {
            super(0);
            kotlin.jvm.internal.u.j(title, "title");
            this.f58533a = title;
        }

        public final String a() {
            return this.f58533a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f58533a, ((b) obj).f58533a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f58533a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("HeaderItem(title="), this.f58533a, ")");
        }
    }

    /* compiled from: ListItem.kt */
    /* loaded from: classes5.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        private final MeasuresGroup f58534a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasuresGroup measureGroup) {
            super(0);
            kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
            this.f58534a = measureGroup;
        }

        public final MeasuresGroup a() {
            return this.f58534a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f58534a, ((c) obj).f58534a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f58534a.hashCode();
        }

        public final String toString() {
            return "MeasureItem(measureGroup=" + this.f58534a + ")";
        }
    }

    public /* synthetic */ d(int i11) {
        this();
    }

    private d() {
    }
}
