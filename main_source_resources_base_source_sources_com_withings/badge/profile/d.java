package com.withings.badge.profile;

import com.withings.badge.model.BadgeModelUI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: ProfileBadgeCarouselScreenState.kt */
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: ProfileBadgeCarouselScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final List<BadgeModelUI.UnlockedBadgeModelUI> f32878a;

        public a(ArrayList arrayList) {
            this.f32878a = arrayList;
        }

        public final List<BadgeModelUI.UnlockedBadgeModelUI> a() {
            return this.f32878a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f32878a, ((a) obj).f32878a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f32878a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Loaded(badges="), this.f32878a, ")");
        }
    }

    /* compiled from: ProfileBadgeCarouselScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32879a = new b();

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
            return 1091341471;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ProfileBadgeCarouselScreenState.kt */
    /* loaded from: classes3.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32880a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return -347425848;
        }

        public final String toString() {
            return "NoBadgeUnlocked";
        }
    }
}
