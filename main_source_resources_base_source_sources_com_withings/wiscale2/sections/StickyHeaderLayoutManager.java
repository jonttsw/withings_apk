package com.withings.wiscale2.sections;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sections.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
@Deprecated
/* loaded from: classes5.dex */
public class StickyHeaderLayoutManager extends RecyclerView.l {

    /* renamed from: p  reason: collision with root package name */
    d f59594p;

    /* renamed from: s  reason: collision with root package name */
    a f59597s;

    /* renamed from: t  reason: collision with root package name */
    int f59598t;

    /* renamed from: u  reason: collision with root package name */
    int f59599u;

    /* renamed from: w  reason: collision with root package name */
    SavedState f59601w;

    /* renamed from: q  reason: collision with root package name */
    HashSet<View> f59595q = new HashSet<>();

    /* renamed from: r  reason: collision with root package name */
    HashMap<Integer, HeaderPosition> f59596r = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    int f59600v = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class HeaderPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final HeaderPosition f59602a;

        /* renamed from: b  reason: collision with root package name */
        public static final HeaderPosition f59603b;

        /* renamed from: c  reason: collision with root package name */
        public static final HeaderPosition f59604c;

        /* renamed from: d  reason: collision with root package name */
        public static final HeaderPosition f59605d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ HeaderPosition[] f59606e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.wiscale2.sections.StickyHeaderLayoutManager$HeaderPosition] */
        static {
            ?? r02 = new Enum("NONE", 0);
            f59602a = r02;
            ?? r12 = new Enum("NATURAL", 1);
            f59603b = r12;
            ?? r22 = new Enum("STICKY", 2);
            f59604c = r22;
            ?? r32 = new Enum("TRAILING", 3);
            f59605d = r32;
            f59606e = new HeaderPosition[]{r02, r12, r22, r32};
        }

        private HeaderPosition() {
            throw null;
        }

        public static HeaderPosition valueOf(String str) {
            return (HeaderPosition) Enum.valueOf(HeaderPosition.class, str);
        }

        public static HeaderPosition[] values() {
            return (HeaderPosition[]) f59606e.clone();
        }
    }

    /* loaded from: classes5.dex */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        int f59607a = -1;

        /* renamed from: b  reason: collision with root package name */
        int f59608b = 0;

        /* loaded from: classes5.dex */
        final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.sections.StickyHeaderLayoutManager$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f59607a = -1;
                obj.f59608b = 0;
                obj.f59607a = parcel.readInt();
                obj.f59608b = parcel.readInt();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(getClass().getCanonicalName());
            sb2.append(" firstViewAdapterPosition: ");
            sb2.append(this.f59607a);
            sb2.append(" firstViewTop: ");
            return e.c(sb2, this.f59608b, ">");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f59607a);
            parcel.writeInt(this.f59608b);
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void R1(View view, HeaderPosition headerPosition, HeaderPosition headerPosition2);
    }

    /* loaded from: classes5.dex */
    class b extends t {

        /* renamed from: q  reason: collision with root package name */
        private final float f59609q;

        /* renamed from: r  reason: collision with root package name */
        private final float f59610r;

        public b(Context context, int i11) {
            super(context);
            float f11;
            this.f59609q = i11;
            float q11 = q(context.getResources().getDisplayMetrics());
            if (i11 < 10000) {
                f11 = (int) (Math.abs(i11) * q11);
            } else {
                f11 = 1000.0f;
            }
            this.f59610r = f11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final PointF a(int i11) {
            int i12;
            StickyHeaderLayoutManager stickyHeaderLayoutManager = StickyHeaderLayoutManager.this;
            stickyHeaderLayoutManager.d1();
            int i13 = stickyHeaderLayoutManager.f59598t;
            if (i11 > i13) {
                i12 = 1;
            } else if (i11 < i13) {
                i12 = -1;
            } else {
                i12 = 0;
            }
            return new PointF(0.0f, i12);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public final int r(int i11) {
            return (int) (this.f59610r * (i11 / this.f59609q));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void B0(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        if (parcelable instanceof SavedState) {
            this.f59601w = (SavedState) parcelable;
            K0();
            return;
        }
        Log.e("StickyHeaderLayoutManager", "onRestoreInstanceState: invalid saved state class, expected: " + SavedState.class.getCanonicalName() + " got: " + parcelable.getClass().getCanonicalName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable C0() {
        SavedState savedState = this.f59601w;
        if (savedState != null) {
            return savedState;
        }
        if (this.f59594p != null) {
            d1();
        }
        SavedState savedState2 = new SavedState();
        savedState2.f59607a = this.f59598t;
        savedState2.f59608b = this.f59599u;
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void M0(int i11) {
        if (i11 >= 0 && i11 <= N()) {
            this.f59600v = i11;
            this.f59601w = null;
            K0();
            return;
        }
        throw new IndexOutOfBoundsException("adapter position out of range");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int N0(int i11, RecyclerView.r rVar, RecyclerView.v vVar) {
        View e11;
        int F;
        boolean z5;
        int I;
        if (C() == 0) {
            return 0;
        }
        if (i11 < 0) {
            View a12 = a1();
            if (a12 != null) {
                int S = S();
                int c02 = c0() - T();
                int i12 = 0;
                while (i12 > i11) {
                    int min = Math.min(i12 - i11, Math.max(-RecyclerView.l.K(a12), 0));
                    i12 -= min;
                    try {
                        l0(min);
                    } catch (NullPointerException e12) {
                        x70.b.t(this, "Hey, developer ! Fix this bug !", new Object[0]);
                        x70.b.e(this, e12);
                    }
                    int i13 = this.f59598t;
                    if (i13 <= 0 || i12 <= i11) {
                        break;
                    }
                    int i14 = i13 - 1;
                    this.f59598t = i14;
                    int g11 = this.f59594p.g(i14);
                    if (g11 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int i15 = this.f59598t;
                    if (z5) {
                        int i16 = i15 - 1;
                        this.f59598t = i16;
                        if (i16 < 0) {
                            break;
                        }
                        g11 = this.f59594p.g(i16);
                        if (g11 == 0) {
                            break;
                        }
                    }
                    View e13 = rVar.e(this.f59598t);
                    f(e13, 0);
                    int K = RecyclerView.l.K(a12);
                    if (g11 == 1) {
                        I = RecyclerView.l.I(Z0(this.f59594p.k(this.f59598t), rVar));
                    } else {
                        j0(e13);
                        I = RecyclerView.l.I(e13);
                    }
                    RecyclerView.l.h0(e13, S, K - I, c02, K);
                    a12 = e13;
                }
                i11 = i12;
            }
        } else {
            int L = L();
            View view = null;
            if (C() != 0) {
                int C = C();
                int i17 = Integer.MIN_VALUE;
                for (int i18 = 0; i18 < C; i18++) {
                    View B = B(i18);
                    if (B != null && b1(B) != -1) {
                        if (this.f59594p.g(b1(B)) != 0 && (F = RecyclerView.l.F(B)) > i17) {
                            view = B;
                            i17 = F;
                        }
                    }
                }
            }
            if (view != null) {
                int S2 = S();
                int c03 = c0() - T();
                int i19 = 0;
                while (i19 < i11) {
                    int i21 = -Math.min(i11 - i19, Math.max(RecyclerView.l.F(view) - L, 0));
                    i19 -= i21;
                    try {
                        l0(i21);
                    } catch (NullPointerException e14) {
                        x70.b.t(this, "Hey, developer ! Fix this bug !", new Object[0]);
                        x70.b.e(this, e14);
                    }
                    int b12 = b1(view);
                    int i22 = b12 + 1;
                    if (i19 >= i11 || i22 >= vVar.b()) {
                        break;
                    }
                    int F2 = RecyclerView.l.F(view);
                    int g12 = this.f59594p.g(i22);
                    if (g12 == 0) {
                        View Z0 = Z0(this.f59594p.k(i22), rVar);
                        int I2 = RecyclerView.l.I(Z0);
                        RecyclerView.l.h0(Z0, S2, 0, c03, I2);
                        e11 = rVar.e(b12 + 2);
                        e(e11);
                        RecyclerView.l.h0(e11, S2, F2, c03, I2 + F2);
                    } else if (g12 == 1) {
                        View Z02 = Z0(this.f59594p.k(i22), rVar);
                        int I3 = RecyclerView.l.I(Z02);
                        RecyclerView.l.h0(Z02, S2, 0, c03, I3);
                        e11 = rVar.e(i22);
                        e(e11);
                        RecyclerView.l.h0(e11, S2, F2, c03, I3 + F2);
                    } else {
                        e11 = rVar.e(i22);
                        e(e11);
                        j0(e11);
                        RecyclerView.l.h0(e11, S2, F2, c03, RecyclerView.l.I(e11) + F2);
                    }
                    view = e11;
                }
                i11 = i19;
            }
        }
        View a13 = a1();
        if (a13 != null) {
            this.f59599u = RecyclerView.l.K(a13);
        }
        e1(rVar);
        int L2 = L();
        int C2 = C();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i23 = 0; i23 < C2; i23++) {
            View B2 = B(i23);
            if (B2 != null && b1(B2) != -1) {
                if (this.f59594p.g(b1(B2)) != 0) {
                    if (RecyclerView.l.F(B2) >= 0 && RecyclerView.l.K(B2) <= L2) {
                        hashSet.add(Integer.valueOf(this.f59594p.k(b1(B2))));
                    } else {
                        hashSet2.add(B2);
                    }
                }
            }
        }
        for (int i24 = 0; i24 < C2; i24++) {
            View B3 = B(i24);
            if (B3 != null && b1(B3) != -1) {
                int k11 = this.f59594p.k(b1(B3));
                if (this.f59594p.g(b1(B3)) == 0 && !hashSet.contains(Integer.valueOf(k11))) {
                    float translationY = B3.getTranslationY();
                    if (RecyclerView.l.F(B3) + translationY < 0.0f || RecyclerView.l.K(B3) + translationY > L2) {
                        hashSet2.add(B3);
                        this.f59595q.remove(B3);
                        this.f59596r.remove(Integer.valueOf(k11));
                    }
                }
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            I0((View) it.next(), rVar);
        }
        d1();
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W0(RecyclerView recyclerView, int i11) {
        if (i11 >= 0 && i11 <= N()) {
            this.f59601w = null;
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                i12 = Math.max(RecyclerView.l.I(recyclerView.getChildAt(i13)), i12);
            }
            int abs = Math.abs((RecyclerView.S(childAt) - i11) * i12);
            if (abs == 0) {
                abs = (int) Math.abs(childAt.getY());
            }
            b bVar = new b(recyclerView.getContext(), abs);
            bVar.k(i11);
            X0(bVar);
            return;
        }
        throw new IndexOutOfBoundsException("adapter position out of range");
    }

    final View Z0(int i11, RecyclerView.r rVar) {
        if (this.f59594p.e(i11)) {
            int C = C();
            for (int i12 = 0; i12 < C; i12++) {
                View B = B(i12);
                if (this.f59594p.g(b1(B)) == 0) {
                    if (this.f59594p.k(b1(B)) == i11) {
                        return B;
                    }
                }
            }
            View e11 = rVar.e(this.f59594p.f(i11));
            this.f59595q.add(e11);
            e(e11);
            j0(e11);
            return e11;
        }
        return null;
    }

    final View a1() {
        int K;
        View view = null;
        if (C() == 0) {
            return null;
        }
        int C = C();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < C; i12++) {
            View B = B(i12);
            if (B != null && b1(B) != -1) {
                if (this.f59594p.g(b1(B)) != 0 && (K = RecyclerView.l.K(B)) < i11) {
                    view = B;
                    i11 = K;
                }
            }
        }
        return view;
    }

    final int b1(View view) {
        return ((d.g) view.getTag(C1987R.id.sectioning_adapter_tag_key_view_viewholder)).getAdapterPosition();
    }

    public final void c1(a aVar) {
        this.f59597s = aVar;
    }

    final void d1() {
        if (C() == 0) {
            this.f59598t = 0;
            this.f59599u = V();
            return;
        }
        View a12 = a1();
        if (a12 != null) {
            this.f59598t = b1(a12);
            this.f59599u = Math.min(a12.getTop(), V());
        }
    }

    final void e1(RecyclerView.r rVar) {
        int K;
        int K2;
        HashSet hashSet = new HashSet();
        int C = C();
        for (int i11 = 0; i11 < C; i11++) {
            View B = B(i11);
            if (B != null && b1(B) != -1) {
                int k11 = this.f59594p.k(b1(B));
                if (hashSet.add(Integer.valueOf(k11)) && this.f59594p.e(k11)) {
                    Z0(k11, rVar);
                }
            }
        }
        int S = S();
        int c02 = c0() - T();
        Iterator<View> it = this.f59595q.iterator();
        while (it.hasNext()) {
            View next = it.next();
            int k12 = this.f59594p.k(b1(next));
            int C2 = C();
            View view = null;
            View view2 = null;
            for (int i12 = 0; i12 < C2; i12++) {
                View B2 = B(i12);
                if (B2 != null) {
                    int g11 = this.f59594p.g(b1(B2));
                    if (g11 != 0) {
                        int k13 = this.f59594p.k(b1(B2));
                        if (k13 == k12) {
                            if (g11 == 1) {
                                view = B2;
                            }
                        } else if (k13 == k12 + 1 && view2 == null) {
                            view2 = B2;
                        }
                    }
                }
            }
            int I = RecyclerView.l.I(next);
            int V = V();
            HeaderPosition headerPosition = HeaderPosition.f59604c;
            if (view != null && (K2 = RecyclerView.l.K(view)) >= V) {
                headerPosition = HeaderPosition.f59603b;
                V = K2;
            }
            if (view2 != null && (K = RecyclerView.l.K(view2) - I) < V) {
                headerPosition = HeaderPosition.f59605d;
                V = K;
            }
            next.bringToFront();
            RecyclerView.l.h0(next, S, V, c02, I + V);
            HashMap<Integer, HeaderPosition> hashMap = this.f59596r;
            if (hashMap.containsKey(Integer.valueOf(k12))) {
                HeaderPosition headerPosition2 = hashMap.get(Integer.valueOf(k12));
                if (headerPosition2 != headerPosition) {
                    hashMap.put(Integer.valueOf(k12), headerPosition);
                    a aVar = this.f59597s;
                    if (aVar != null) {
                        aVar.R1(next, headerPosition2, headerPosition);
                    }
                }
            } else {
                hashMap.put(Integer.valueOf(k12), headerPosition);
                a aVar2 = this.f59597s;
                if (aVar2 != null) {
                    aVar2.R1(next, HeaderPosition.f59602a, headerPosition);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean k() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void m0(RecyclerView.Adapter adapter) {
        try {
            this.f59594p = (d) adapter;
            F0();
            this.f59595q.clear();
            this.f59596r.clear();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectionedRecyclerViewAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void n0(RecyclerView recyclerView) {
        try {
            this.f59594p = (d) recyclerView.getAdapter();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectionedRecyclerViewAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void o0(RecyclerView recyclerView) {
        d1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.LayoutParams x() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void z0(RecyclerView.r rVar, RecyclerView.v vVar) {
        int i11;
        int I;
        if (this.f59594p == null) {
            return;
        }
        int i12 = this.f59600v;
        int i13 = 0;
        if (i12 >= 0) {
            this.f59598t = i12;
            this.f59599u = 0;
            this.f59600v = -1;
        } else {
            SavedState savedState = this.f59601w;
            if (savedState != null && (i11 = savedState.f59607a) >= 0) {
                this.f59598t = i11;
                this.f59599u = savedState.f59608b;
                this.f59601w = null;
            } else {
                d1();
            }
        }
        int i14 = this.f59599u;
        HashSet<View> hashSet = this.f59595q;
        hashSet.clear();
        this.f59596r.clear();
        v(rVar);
        int S = S();
        int c02 = c0() - T();
        int L = L() - Q();
        if (this.f59598t > vVar.b()) {
            this.f59598t = 0;
        }
        int i15 = this.f59598t;
        while (i15 < vVar.b()) {
            View e11 = rVar.e(i15);
            e(e11);
            j0(e11);
            int g11 = this.f59594p.g(b1(e11));
            if (g11 == 0) {
                hashSet.add(e11);
                I = RecyclerView.l.I(e11);
                int i16 = i14 + I;
                RecyclerView.l.h0(e11, S, i14, c02, i16);
                i15++;
                View e12 = rVar.e(i15);
                e(e12);
                RecyclerView.l.h0(e12, S, i14, c02, i16);
            } else if (g11 == 1) {
                View e13 = rVar.e(i15 - 1);
                hashSet.add(e13);
                e(e13);
                j0(e13);
                int I2 = RecyclerView.l.I(e13);
                int i17 = i14 + I2;
                RecyclerView.l.h0(e13, S, i14, c02, i17);
                RecyclerView.l.h0(e11, S, i14, c02, i17);
                I = I2;
            } else {
                I = RecyclerView.l.I(e11);
                RecyclerView.l.h0(e11, S, i14, c02, i14 + I);
            }
            i14 += I;
            i13 += I;
            if (e11.getBottom() >= L) {
                break;
            }
            i15++;
        }
        int L2 = L() - (Q() + V());
        if (i13 < L2) {
            N0(i13 - L2, rVar, null);
        } else {
            e1(rVar);
        }
    }
}
