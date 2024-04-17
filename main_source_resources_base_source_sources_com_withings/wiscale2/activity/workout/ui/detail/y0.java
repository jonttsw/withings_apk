package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
public final class y0 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f49824a;

    /* renamed from: b  reason: collision with root package name */
    private final View f49825b;

    public y0(View view) {
        super(view);
        this.f49824a = (ImageView) view.findViewById(C1987R.id.photo_image);
        this.f49825b = view.findViewById(C1987R.id.selected_view);
    }

    public final void a(w0 photoItem) {
        int i11;
        kotlin.jvm.internal.u.j(photoItem, "photoItem");
        if (photoItem.a()) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        this.f49825b.setVisibility(i11);
        ImageView image = this.f49824a;
        kotlin.jvm.internal.u.i(image, "image");
        Object b10 = photoItem.b();
        Context context = image.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        f5.a(image, b10, true, ah.u.w(C1987R.attr.colorOnSurface, context, -65281));
    }

    public final void b() {
        this.f49825b.setVisibility(4);
        this.f49824a.setImageResource(C1987R.drawable.ic_square_add_24dp);
    }
}
