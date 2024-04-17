package com.withings.badge.list;

import com.withings.badge.model.BadgeSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: BadgesScreenState.kt */
/* loaded from: classes3.dex */
public interface k {

    /* compiled from: BadgesScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        private final List<BadgeSection> f32841a;

        public a(ArrayList arrayList) {
            this.f32841a = arrayList;
        }

        public final List<BadgeSection> a() {
            return this.f32841a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f32841a, ((a) obj).f32841a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f32841a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Loaded(badgesSections="), this.f32841a, ")");
        }
    }

    /* compiled from: BadgesScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32842a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public final int hashCode() {
            return -1215034904;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
