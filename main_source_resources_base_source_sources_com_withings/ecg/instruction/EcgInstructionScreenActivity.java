package com.withings.ecg.instruction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.withings.android.activity.WithingsActivity;
import com.withings.ecg.instruction.EcgInstructionScreenActivity;
import com.withings.wiscale2.C1987R;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.h;
import nm0.y;
/* compiled from: EcgInstructionScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/instruction/EcgInstructionScreenActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "CloseActivityBroadcastReceiver", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgInstructionScreenActivity extends WithingsActivity {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f38566i = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f38567a = h.b(new e());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f38568b = h.b(new g());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f38569c = h.b(new a());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f38570d = h.b(new d());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f38571e = h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38572f = h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38573g = h.b(new f());

    /* renamed from: h  reason: collision with root package name */
    private CloseActivityBroadcastReceiver f38574h = new CloseActivityBroadcastReceiver();

    /* compiled from: EcgInstructionScreenActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/ecg/instruction/EcgInstructionScreenActivity$CloseActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "ecg_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public final class CloseActivityBroadcastReceiver extends BroadcastReceiver {
        public CloseActivityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u.j(context, "context");
            u.j(intent, "intent");
            EcgInstructionScreenActivity ecgInstructionScreenActivity = EcgInstructionScreenActivity.this;
            ecgInstructionScreenActivity.setResult(-1);
            ecgInstructionScreenActivity.finish();
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) EcgInstructionScreenActivity.this.findViewById(C1987R.id.preview);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<MaterialButton> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            return (MaterialButton) EcgInstructionScreenActivity.this.findViewById(C1987R.id.restart);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EcgInstructionScreenActivity.this.findViewById(C1987R.id.instruction_subtitle);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EcgInstructionScreenActivity.this.findViewById(C1987R.id.instruction_title);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<Toolbar> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) EcgInstructionScreenActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<ConstraintLayout> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) EcgInstructionScreenActivity.this.findViewById(C1987R.id.container);
        }
    }

    /* compiled from: EcgInstructionScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<VideoView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final VideoView invoke() {
            return (VideoView) EcgInstructionScreenActivity.this.findViewById(C1987R.id.video);
        }
    }

    public static void A3(EcgInstructionScreenActivity ecgInstructionScreenActivity, MediaPlayer mediaPlayer) {
        ecgInstructionScreenActivity.getClass();
        nm0.g gVar = ecgInstructionScreenActivity.f38573g;
        float videoWidth = (mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight()) / (((ConstraintLayout) gVar.getValue()).getWidth() / ((ConstraintLayout) gVar.getValue()).getHeight());
        if (videoWidth >= 1.0f) {
            ((ConstraintLayout) gVar.getValue()).setScaleX(videoWidth);
        } else {
            ((ConstraintLayout) gVar.getValue()).setScaleY(1.0f / videoWidth);
        }
    }

    public static void B3(EcgInstructionScreenActivity this$0) {
        u.j(this$0, "this$0");
        ImageView imageView = (ImageView) this$0.f38569c.getValue();
        u.i(imageView, "<get-previewView>(...)");
        imageView.setVisibility(0);
        MaterialButton materialButton = (MaterialButton) this$0.f38572f.getValue();
        u.i(materialButton, "<get-restartButton>(...)");
        materialButton.setVisibility(0);
    }

    public static void C3(EcgInstructionScreenActivity this$0, int i11) {
        u.j(this$0, "this$0");
        if (i11 == 3) {
            ImageView imageView = (ImageView) this$0.f38569c.getValue();
            u.i(imageView, "<get-previewView>(...)");
            imageView.setVisibility(4);
        }
    }

    public static void z3(EcgInstructionScreenActivity this$0, Uri uri) {
        u.j(this$0, "this$0");
        u.j(uri, "$uri");
        MaterialButton materialButton = (MaterialButton) this$0.f38572f.getValue();
        u.i(materialButton, "<get-restartButton>(...)");
        materialButton.setVisibility(8);
        nm0.g gVar = this$0.f38568b;
        ((VideoView) gVar.getValue()).setVideoURI(uri);
        ((VideoView) gVar.getValue()).start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.screen_instructions_video);
        setSupportActionBar((Toolbar) this.f38567a.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(false);
            supportActionBar.r();
        }
        androidx.core.content.a.registerReceiver(this, this.f38574h, new IntentFilter("com.withings.ecg.EcgInstructionScreenActivity"), 4);
        nm0.g gVar = this.f38572f;
        MaterialButton materialButton = (MaterialButton) gVar.getValue();
        u.i(materialButton, "<get-restartButton>(...)");
        materialButton.setVisibility(8);
        ((ImageView) this.f38569c.getValue()).setImageResource(C1987R.drawable.hwa08_ecg_tuto_video_first_frame_circular);
        ((TextView) this.f38570d.getValue()).setText(getString(C1987R.string.ecg_instruction_title));
        ((TextView) this.f38571e.getValue()).setText(getString(C1987R.string.ecg_instruction_subtitle));
        File file = new File(getFilesDir(), "hwa08_ecg_tuto_circular.mp4");
        if (!file.exists()) {
            InputStream open = getAssets().open("hwa08_ecg_tuto_circular.mp4");
            u.i(open, "open(...)");
            String absolutePath = file.getAbsolutePath();
            u.i(absolutePath, "getAbsolutePath(...)");
            ah.h.h(open, absolutePath);
        }
        Uri fromFile = Uri.fromFile(file);
        VideoView videoView = (VideoView) this.f38568b.getValue();
        videoView.setAudioFocusRequest(0);
        videoView.setVideoURI(fromFile);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: pq.a
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                EcgInstructionScreenActivity.A3(EcgInstructionScreenActivity.this, mediaPlayer);
            }
        });
        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: pq.b
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
                EcgInstructionScreenActivity.C3(EcgInstructionScreenActivity.this, i11);
                return false;
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: pq.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                EcgInstructionScreenActivity.B3(EcgInstructionScreenActivity.this);
            }
        });
        videoView.start();
        ((MaterialButton) gVar.getValue()).setOnClickListener(new pq.d(0, this, fromFile));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ay.b.w(this, this.f38574h);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(-1);
            finish();
            y yVar = y.f85009a;
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
