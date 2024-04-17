package com.withings.wiscale2.activity.workout.photo.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import com.withings.amazon.model.AmazonPictureInfo;
import java.util.List;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import va0.f;
/* compiled from: WorkoutPhotosActivity.kt */
/* loaded from: classes4.dex */
final class a extends k0 {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends Object> f49008a;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f49008a = i0.f76187a;
    }

    public final void a(List<? extends Object> value) {
        u.j(value, "value");
        this.f49008a = value;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f49008a.size();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        int i12 = f.f103537g;
        Object photo = this.f49008a.get(i11);
        u.j(photo, "photo");
        if (photo instanceof AmazonPictureInfo) {
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_photo_url", (AmazonPictureInfo) photo);
            fVar.setArguments(bundle);
            return fVar;
        }
        f fVar2 = new f();
        Bundle bundle2 = new Bundle();
        bundle2.putString("extra_photo_uri", (String) photo);
        fVar2.setArguments(bundle2);
        return fVar2;
    }

    @Override // androidx.viewpager.widget.e
    public final int getItemPosition(Object object) {
        u.j(object, "object");
        return -2;
    }
}
