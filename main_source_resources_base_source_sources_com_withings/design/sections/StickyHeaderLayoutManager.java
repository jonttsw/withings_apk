package com.withings.design.sections;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.withings.design.sections.d;
import com.withings.wiscale2.C1987R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class StickyHeaderLayoutManager extends RecyclerView.l {

    /* renamed from: p  reason: collision with root package name */
    d f36114p;

    /* renamed from: s  reason: collision with root package name */
    int f36117s;

    /* renamed from: t  reason: collision with root package name */
    int f36118t;

    /* renamed from: v  reason: collision with root package name */
    SavedState f36120v;

    /* renamed from: q  reason: collision with root package name */
    HashSet<View> f36115q = new HashSet<>();

    /* renamed from: r  reason: collision with root package name */
    HashMap<Integer, HeaderPosition> f36116r = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    int f36119u = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class HeaderPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final HeaderPosition f36121a;

        /* renamed from: b  reason: collision with root package name */
        private static final /* synthetic */ HeaderPosition[] f36122b;
        /* JADX INFO: Fake field, exist only in values array */
        HeaderPosition EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.design.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.design.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.design.sections.StickyHeaderLayoutManager$HeaderPosition] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.design.sections.StickyHeaderLayoutManager$HeaderPosition] */
        static {
            ?? r02 = new Enum("NONE", 0);
            ?? r12 = new Enum("NATURAL", 1);
            ?? r22 = new Enum("STICKY", 2);
            f36121a = r22;
            f36122b = new HeaderPosition[]{r02, r12, r22, new Enum("TRAILING", 3)};
        }

        private HeaderPosition() {
            throw null;
        }

        public static HeaderPosition valueOf(String str) {
            return (HeaderPosition) Enum.valueOf(HeaderPosition.class, str);
        }

        public static HeaderPosition[] values() {
            return (HeaderPosition[]) f36122b.clone();
        }
    }

    /* loaded from: classes3.dex */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        int f36123a = -1;

        /* renamed from: b  reason: collision with root package name */
        int f36124b = 0;

        /* loaded from: classes3.dex */
        final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.withings.design.sections.StickyHeaderLayoutManager$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f36123a = -1;
                obj.f36124b = 0;
                obj.f36123a = parcel.readInt();
                obj.f36124b = parcel.readInt();
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
            sb2.append(this.f36123a);
            sb2.append(" firstViewTop: ");
            return e.c(sb2, this.f36124b, ">");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f36123a);
            parcel.writeInt(this.f36124b);
        }
    }

    /* loaded from: classes3.dex */
    class a extends t {

        /* renamed from: q  reason: collision with root package name */
        private final float f36125q;

        /* renamed from: r  reason: collision with root package name */
        private final float f36126r;

        public a(Context context, int i11) {
            super(context);
            float f11;
            this.f36125q = i11;
            float q11 = q(context.getResources().getDisplayMetrics());
            if (i11 < 10000) {
                f11 = (int) (Math.abs(i11) * q11);
            } else {
                f11 = 1000.0f;
            }
            this.f36126r = f11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final PointF a(int i11) {
            int i12;
            StickyHeaderLayoutManager stickyHeaderLayoutManager = StickyHeaderLayoutManager.this;
            stickyHeaderLayoutManager.c1();
            int i13 = stickyHeaderLayoutManager.f36117s;
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
            return (int) (this.f36126r * (i11 / this.f36125q));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void B0(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        if (parcelable instanceof SavedState) {
            this.f36120v = (SavedState) parcelable;
            K0();
            return;
        }
        Log.e("StickyHeaderLayoutManager", "onRestoreInstanceState: invalid saved state class, expected: " + SavedState.class.getCanonicalName() + " got: " + parcelable.getClass().getCanonicalName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable C0() {
        SavedState savedState = this.f36120v;
        if (savedState != null) {
            return savedState;
        }
        if (this.f36114p != null) {
            c1();
        }
        SavedState savedState2 = new SavedState();
        savedState2.f36123a = this.f36117s;
        savedState2.f36124b = this.f36118t;
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void M0(int i11) {
        if (i11 >= 0 && i11 <= N()) {
            this.f36119u = i11;
            this.f36120v = null;
            K0();
            return;
        }
        throw new IndexOutOfBoundsException("adapter position out of range");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final int N0(int i11, RecyclerView.r rVar, RecyclerView.v vVar) {
        if (C() == 0) {
            return 0;
        }
        if (i11 < 0) {
            View Z0 = Z0();
            if (Z0 != null) {
                int S = S();
                int c02 = c0() - T();
                int i12 = 0;
                while (i12 > i11) {
                    int min = Math.min(i12 - i11, Math.max(-RecyclerView.l.K(Z0), 0));
                    i12 -= min;
                    try {
                        l0(min);
                    } catch (NullPointerException e11) {
                        x70.b.t(this, "Hey, developer ! Fix this bug !", new Object[0]);
                        x70.b.e(this, e11);
                    }
                    int i13 = this.f36117s;
                    if (i13 <= 0 || i12 <= i11) {
                        break;
                    }
                    int i14 = i13 - 1;
                    this.f36117s = i14;
                    this.f36114p.getItemViewType(i14);
                    View e12 = rVar.e(this.f36117s);
                    f(e12, 0);
                    int K = RecyclerView.l.K(Z0);
                    j0(e12);
                    RecyclerView.l.h0(e12, S, K - RecyclerView.l.I(e12), c02, K);
                    Z0 = e12;
                }
                i11 = i12;
            }
        } else {
            int L = L();
            View view = null;
            if (C() != 0) {
                int C = C();
                int i15 = Integer.MIN_VALUE;
                for (int i16 = 0; i16 < C; i16++) {
                    View B = B(i16);
                    if (B != null && a1(B) != -1) {
                        b1(B);
                        int F = RecyclerView.l.F(B);
                        if (F > i15) {
                            view = B;
                            i15 = F;
                        }
                    }
                }
            }
            if (view != null) {
                int S2 = S();
                int c03 = c0() - T();
                int i17 = 0;
                while (i17 < i11) {
                    int i18 = -Math.min(i11 - i17, Math.max(RecyclerView.l.F(view) - L, 0));
                    i17 -= i18;
                    try {
                        l0(i18);
                    } catch (NullPointerException e13) {
                        x70.b.t(this, "Hey, developer ! Fix this bug !", new Object[0]);
                        x70.b.e(this, e13);
                    }
                    int a12 = a1(view) + 1;
                    if (i17 >= i11 || a12 >= vVar.b()) {
                        break;
                    }
                    int F2 = RecyclerView.l.F(view);
                    this.f36114p.getItemViewType(a12);
                    View e14 = rVar.e(a12);
                    e(e14);
                    j0(e14);
                    RecyclerView.l.h0(e14, S2, F2, c03, RecyclerView.l.I(e14) + F2);
                    view = e14;
                }
                i11 = i17;
            }
        }
        View Z02 = Z0();
        if (Z02 != null) {
            this.f36118t = RecyclerView.l.K(Z02);
        }
        d1(rVar);
        int L2 = L();
        int C2 = C();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i19 = 0; i19 < C2; i19++) {
            View B2 = B(i19);
            if (B2 != null && a1(B2) != -1) {
                b1(B2);
                if (RecyclerView.l.F(B2) >= 0 && RecyclerView.l.K(B2) <= L2) {
                    this.f36114p.e(a1(B2));
                    hashSet.add(-1);
                } else {
                    hashSet2.add(B2);
                }
            }
        }
        for (int i21 = 0; i21 < C2; i21++) {
            View B3 = B(i21);
            if (B3 != null && a1(B3) != -1) {
                this.f36114p.e(a1(B3));
                b1(B3);
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            I0((View) it.next(), rVar);
        }
        c1();
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W0(RecyclerView recyclerView, int i11) {
        if (i11 >= 0 && i11 <= N()) {
            this.f36120v = null;
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
            a aVar = new a(recyclerView.getContext(), abs);
            aVar.k(i11);
            X0(aVar);
            return;
        }
        throw new IndexOutOfBoundsException("adapter position out of range");
    }

    final View Z0() {
        View view = null;
        if (C() == 0) {
            return null;
        }
        int C = C();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < C; i12++) {
            View B = B(i12);
            if (B != null && a1(B) != -1) {
                b1(B);
                int K = RecyclerView.l.K(B);
                if (K < i11) {
                    view = B;
                    i11 = K;
                }
            }
        }
        return view;
    }

    final int a1(View view) {
        return ((d.f) view.getTag(C1987R.id.sectioning_adapter_tag_key_view_viewholder)).getAdapterPosition();
    }

    final int b1(View view) {
        this.f36114p.getItemViewType(a1(view));
        return 2;
    }

    final void c1() {
        if (C() == 0) {
            this.f36117s = 0;
            this.f36118t = V();
            return;
        }
        View Z0 = Z0();
        if (Z0 != null) {
            this.f36117s = a1(Z0);
            this.f36118t = Math.min(Z0.getTop(), V());
        }
    }

    final void d1(RecyclerView.r rVar) {
        HashSet hashSet = new HashSet();
        int C = C();
        for (int i11 = 0; i11 < C; i11++) {
            View B = B(i11);
            if (B != null && a1(B) != -1) {
                this.f36114p.e(a1(B));
                if (hashSet.add(-1)) {
                    this.f36114p.getClass();
                }
            }
        }
        int S = S();
        int c02 = c0() - T();
        Iterator<View> it = this.f36115q.iterator();
        while (it.hasNext()) {
            View next = it.next();
            this.f36114p.e(a1(next));
            int C2 = C();
            for (int i12 = 0; i12 < C2; i12++) {
                View B2 = B(i12);
                if (B2 != null) {
                    b1(B2);
                    this.f36114p.e(a1(B2));
                }
            }
            int I = RecyclerView.l.I(next);
            int V = V();
            HeaderPosition headerPosition = HeaderPosition.f36121a;
            next.bringToFront();
            RecyclerView.l.h0(next, S, V, c02, I + V);
            HashMap<Integer, HeaderPosition> hashMap = this.f36116r;
            if (hashMap.containsKey(-1)) {
                if (hashMap.get(-1) != headerPosition) {
                    hashMap.put(-1, headerPosition);
                }
            } else {
                hashMap.put(-1, headerPosition);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void m0(RecyclerView.Adapter adapter) {
        try {
            this.f36114p = (d) adapter;
            F0();
            this.f36115q.clear();
            this.f36116r.clear();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectionedRecyclerViewAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void n0(RecyclerView recyclerView) {
        try {
            this.f36114p = (d) recyclerView.getAdapter();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectionedRecyclerViewAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void o0(RecyclerView recyclerView) {
        c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final RecyclerView.LayoutParams x() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void z0(RecyclerView.r rVar, RecyclerView.v vVar) {
        int i11;
        if (this.f36114p == null) {
            return;
        }
        int i12 = this.f36119u;
        int i13 = 0;
        if (i12 >= 0) {
            this.f36117s = i12;
            this.f36118t = 0;
            this.f36119u = -1;
        } else {
            SavedState savedState = this.f36120v;
            if (savedState != null && (i11 = savedState.f36123a) >= 0) {
                this.f36117s = i11;
                this.f36118t = savedState.f36124b;
                this.f36120v = null;
            } else {
                c1();
            }
        }
        int i14 = this.f36118t;
        this.f36115q.clear();
        this.f36116r.clear();
        v(rVar);
        int S = S();
        int c02 = c0() - T();
        int L = L() - Q();
        if (this.f36117s > vVar.b()) {
            this.f36117s = 0;
        }
        int i15 = this.f36117s;
        while (i15 < vVar.b()) {
            View e11 = rVar.e(i15);
            e(e11);
            j0(e11);
            b1(e11);
            int I = RecyclerView.l.I(e11);
            int i16 = i14 + I;
            RecyclerView.l.h0(e11, S, i14, c02, i16);
            i13 += I;
            if (e11.getBottom() >= L) {
                break;
            }
            i15++;
            i14 = i16;
        }
        int L2 = L() - (Q() + V());
        if (i13 < L2) {
            N0(i13 - L2, rVar, null);
        } else {
            d1(rVar);
        }
    }
}
