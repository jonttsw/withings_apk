package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import coil.size.Scale;
import com.withings.amazon.model.AmazonPictureInfo;
import ga.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WorkoutImage.kt */
/* loaded from: classes4.dex */
public final class f5 {
    public static final void a(ImageView imageView, Object obj, boolean z5, int i11) {
        String obj2;
        if (obj != null) {
            ColorDrawable colorDrawable = new ColorDrawable(i11);
            boolean z11 = obj instanceof AmazonPictureInfo;
            if (z11) {
                obj2 = (String) BuildersKt.runBlocking(Dispatchers.getIO(), new e5((AmazonPictureInfo) obj, null));
                if (obj2 == null) {
                    imageView.setImageDrawable(colorDrawable);
                    return;
                }
            } else {
                obj2 = obj.toString();
            }
            w9.g a11 = w9.a.a(imageView.getContext());
            f.a aVar = new f.a(imageView.getContext());
            aVar.d(obj2);
            aVar.q(imageView);
            aVar.n(Scale.f23221a);
            aVar.l(colorDrawable);
            aVar.h(colorDrawable);
            if (z11) {
                aVar.a("x-amz-server-side-encryption-customer-algorithm", "AES256");
                AmazonPictureInfo amazonPictureInfo = (AmazonPictureInfo) obj;
                String b10 = com.withings.common.device.s.b(amazonPictureInfo.a());
                kotlin.jvm.internal.u.i(b10, "getEncoded64(...)");
                aVar.a("x-amz-server-side-encryption-customer-key", b10);
                String d11 = com.withings.common.device.s.d(amazonPictureInfo.a());
                kotlin.jvm.internal.u.i(d11, "getMD5Encoded64(...)");
                aVar.a("x-amz-server-side-encryption-customer-key-md5", d11);
            }
            if (z5) {
                Context context = imageView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                float k11 = ah.g.k(8, context);
                aVar.s(new ja.b(k11, k11, k11, k11));
            }
            a11.d(aVar.b());
        }
    }
}
