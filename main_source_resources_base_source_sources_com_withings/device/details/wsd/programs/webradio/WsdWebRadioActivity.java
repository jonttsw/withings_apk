package com.withings.device.details.wsd.programs.webradio;

import android.app.Activity;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.util.log.Fail;
import com.withings.webradio.GetTreesHelper;
import com.withings.webradio.R;
import com.withings.webradio.WebRadios;
import com.withings.webradio.model.WebRadio;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.webradio.ui.WebRadioAbstractFragment;
import com.withings.webradio.ui.WebRadioCategoriesFragment;
import com.withings.webradio.ui.WebRadioEmptyFragment;
import com.withings.webradio.ui.WebRadioListFragment;
import com.withings.webradio.ui.WebRadioNodeFragment;
import com.withings.webradio.ui.WebRadioViewPagerFragment;
import com.withings.wiscale2.C1987R;
import ej.w;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WsdWebRadioActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withings/device/details/wsd/programs/webradio/WsdWebRadioActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/webradio/ui/WebRadioCategoriesFragment$Callback;", "Lcom/withings/webradio/ui/WebRadioNodeFragment$Callback;", "Lcom/withings/webradio/ui/WebRadioListFragment$Callback;", "Lcom/withings/webradio/ui/WebRadioViewPagerFragment$Callback;", "Lcom/withings/webradio/GetTreesHelper$Callback;", "<init>", "()V", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdWebRadioActivity extends Hilt_WsdWebRadioActivity implements WebRadioCategoriesFragment.Callback, WebRadioNodeFragment.Callback, WebRadioListFragment.Callback, WebRadioViewPagerFragment.Callback, GetTreesHelper.Callback {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f37279u = 0;

    /* renamed from: e  reason: collision with root package name */
    private Device f37280e;

    /* renamed from: f  reason: collision with root package name */
    private DeviceAlarm f37281f;

    /* renamed from: g  reason: collision with root package name */
    private WsdProgram f37282g;

    /* renamed from: h  reason: collision with root package name */
    private WsdSetProgramConversation f37283h;

    /* renamed from: i  reason: collision with root package name */
    private Fragment f37284i;

    /* renamed from: j  reason: collision with root package name */
    private int f37285j;

    /* renamed from: k  reason: collision with root package name */
    private String f37286k;

    /* renamed from: l  reason: collision with root package name */
    private WebRadioCategory f37287l;

    /* renamed from: m  reason: collision with root package name */
    private WebRadioNode f37288m;

    /* renamed from: n  reason: collision with root package name */
    private Location f37289n;

    /* renamed from: o  reason: collision with root package name */
    private SearchView f37290o;

    /* renamed from: p  reason: collision with root package name */
    private GetTreesHelper f37291p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f37292q = true;

    /* renamed from: r  reason: collision with root package name */
    private Toolbar f37293r;

    /* renamed from: s  reason: collision with root package name */
    private int f37294s;
    @Inject

    /* renamed from: t  reason: collision with root package name */
    public WebRadiosRemoteRepository f37295t;

    /* compiled from: WsdWebRadioActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37296a;

        static {
            int[] iArr = new int[WebRadioCategory.values().length];
            try {
                iArr[WebRadioCategory.LocalRadio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebRadioCategory.Trending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebRadioCategory.Sports.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebRadioCategory.Classical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebRadioCategory.Ambient.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WebRadioCategory.Mediative.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WebRadioCategory.News.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WebRadioCategory.Music.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WebRadioCategory.Talk.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WebRadioCategory.Country.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WebRadioCategory.Language.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WebRadioCategory.Genres.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f37296a = iArr;
        }
    }

    /* compiled from: WsdWebRadioActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements SearchView.m {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final void a(String arg0) {
            u.j(arg0, "arg0");
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public final void b(String arg0) {
            u.j(arg0, "arg0");
            WsdWebRadioActivity wsdWebRadioActivity = WsdWebRadioActivity.this;
            SearchView searchView = wsdWebRadioActivity.f37290o;
            u.g(searchView);
            searchView.clearFocus();
            WsdWebRadioActivity.E3(wsdWebRadioActivity, arg0);
        }
    }

    /* compiled from: WsdWebRadioActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.webradio.WsdWebRadioActivity$onVolumeChanged$1", f = "WsdWebRadioActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            rg.b b10 = rg.b.b();
            WsdWebRadioActivity wsdWebRadioActivity = WsdWebRadioActivity.this;
            WsdSetProgramConversation wsdSetProgramConversation = wsdWebRadioActivity.f37283h;
            u.g(wsdSetProgramConversation);
            b10.k(wsdSetProgramConversation.r(), wsdWebRadioActivity.f37281f, wsdWebRadioActivity.f37280e);
            return y.f85009a;
        }
    }

    public static final void E3(WsdWebRadioActivity wsdWebRadioActivity, String str) {
        wsdWebRadioActivity.getClass();
        wsdWebRadioActivity.f37287l = WebRadioCategory.Search;
        WebRadioNode webRadioNode = new WebRadioNode(null, null, 0L, null, 15, null);
        wsdWebRadioActivity.f37288m = webRadioNode;
        webRadioNode.setTitle(str);
        wsdWebRadioActivity.K3();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.tasks.OnFailureListener, java.lang.Object] */
    private final void H3() {
        LocationServices.getFusedLocationProviderClient((Activity) this).getLastLocation().addOnSuccessListener(this, new com.withings.device.details.wsd.programs.webradio.c(0, new e(this))).addOnFailureListener(this, (OnFailureListener) new Object());
        y yVar = y.f85009a;
    }

    private final void I3() {
        if (mm.a.f82252a.a() && this.f37292q) {
            if (androidx.core.content.a.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 && androidx.core.content.a.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                androidx.core.app.a.d(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
                return;
            } else {
                H3();
                return;
            }
        }
        Object systemService = getSystemService("location");
        u.h(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        String bestProvider = locationManager.getBestProvider(criteria, true);
        u.g(bestProvider);
        this.f37289n = locationManager.getLastKnownLocation(bestProvider);
    }

    private final void J3() {
        String string;
        Fragment fragment = this.f37284i;
        if (!(fragment instanceof WebRadioNodeFragment) && !(fragment instanceof WebRadioListFragment) && !(fragment instanceof WebRadioEmptyFragment)) {
            if (fragment instanceof WebRadioViewPagerFragment) {
                string = "";
            } else {
                string = getString(C1987R.string._WEBRADIOS_CATEGORY_TITLE_);
            }
        } else {
            WebRadioNode webRadioNode = this.f37288m;
            if (webRadioNode != null) {
                u.g(webRadioNode);
                if (!TextUtils.isEmpty(webRadioNode.getTitle())) {
                    WebRadioNode webRadioNode2 = this.f37288m;
                    u.g(webRadioNode2);
                    string = webRadioNode2.getTitle();
                }
            }
            WebRadioCategory webRadioCategory = this.f37287l;
            u.g(webRadioCategory);
            string = getString(webRadioCategory.getNameId());
            u.g(string);
        }
        setTitle(string);
    }

    private final void K3() {
        WebRadioListFragment createInstance = WebRadioListFragment.createInstance(this, this.f37287l, this.f37288m, this.f37289n);
        u.g(createInstance);
        G3(createInstance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.isEmpty() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L3() {
        /*
            r2 = this;
            com.withings.webradio.model.WebRadioNode r0 = r2.f37288m
            if (r0 == 0) goto L23
            kotlin.jvm.internal.u.g(r0)
            java.util.List r0 = r0.getChildren()
            if (r0 == 0) goto L1f
            com.withings.webradio.model.WebRadioNode r0 = r2.f37288m
            kotlin.jvm.internal.u.g(r0)
            java.util.List r0 = r0.getChildren()
            kotlin.jvm.internal.u.g(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
        L1f:
            r2.K3()
            return
        L23:
            com.withings.webradio.model.WebRadioCategory r0 = r2.f37287l
            com.withings.webradio.model.WebRadioNode r1 = r2.f37288m
            com.withings.webradio.ui.WebRadioNodeFragment r0 = com.withings.webradio.ui.WebRadioNodeFragment.createInstance(r2, r0, r1)
            kotlin.jvm.internal.u.g(r0)
            r2.G3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.webradio.WsdWebRadioActivity.L3():void");
    }

    public static void z3(WsdWebRadioActivity this$0) {
        int i11;
        u.j(this$0, "this$0");
        Fragment X = this$0.getSupportFragmentManager().X(C1987R.id.content);
        this$0.f37284i = X;
        if (X instanceof WebRadioNodeFragment) {
            u.h(X, "null cannot be cast to non-null type com.withings.webradio.ui.WebRadioNodeFragment");
            this$0.f37288m = ((WebRadioNodeFragment) X).getNode();
        }
        this$0.J3();
        int w11 = ah.u.w(C1987R.attr.colorAccent, this$0, -65281);
        if (this$0.f37284i instanceof WebRadioViewPagerFragment) {
            i11 = C1987R.drawable.icon_medium_navigation_close;
        } else {
            i11 = C1987R.drawable.icon_medium_navigation_backandroid;
        }
        Toolbar toolbar = this$0.f37293r;
        if (toolbar != null) {
            toolbar.setNavigationIcon(y70.a.c(i11, this$0, w11));
        }
        if (this$0.getSupportFragmentManager().a0() == 0) {
            this$0.finish();
        }
    }

    protected final void G3(Fragment fragment) {
        if (!u.e(fragment, this.f37284i)) {
            this.f37284i = fragment;
            m0 m11 = getSupportFragmentManager().m();
            m11.m(C1987R.anim.activity_open_enter, C1987R.anim.activity_open_exit, C1987R.anim.activity_close_enter, C1987R.anim.activity_close_exit);
            m11.b(fragment, C1987R.id.content);
            m11.e("fragment");
            m11.f();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        u.j(event, "event");
        Fragment fragment = this.f37284i;
        if (!(fragment instanceof WebRadioViewPagerFragment)) {
            return super.dispatchKeyEvent(event);
        }
        u.h(fragment, "null cannot be cast to non-null type com.withings.webradio.ui.WebRadioViewPagerFragment");
        WebRadioViewPagerFragment webRadioViewPagerFragment = (WebRadioViewPagerFragment) fragment;
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        if (keyCode != 24) {
            if (keyCode != 25) {
                return super.dispatchKeyEvent(event);
            }
            if (action != 0) {
                return true;
            }
            webRadioViewPagerFragment.volumeDown();
            return true;
        } else if (action != 0) {
            return true;
        } else {
            webRadioViewPagerFragment.volumeUp();
            return true;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("webradio_selected", this.f37286k);
        intent.putExtra("result_program", this.f37282g);
        WsdProgram wsdProgram = this.f37282g;
        u.g(wsdProgram);
        intent.putExtra("radio_name", wsdProgram.k());
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.withings.webradio.ui.WebRadioCategoriesFragment.Callback
    public final void onCategorySelected(WebRadioCategoriesFragment wsdWebRadioFragment, WebRadioCategory webRadioCategory) {
        u.j(wsdWebRadioFragment, "wsdWebRadioFragment");
        u.j(webRadioCategory, "webRadioCategory");
        this.f37287l = webRadioCategory;
        this.f37288m = new WebRadioNode(null, null, 0L, null, 15, null);
        switch (a.f37296a[webRadioCategory.ordinal()]) {
            case 1:
                if (this.f37289n == null) {
                    Toast.makeText(this, (int) C1987R.string._LOCATION_ERROR_TITLE_, 0).show();
                    return;
                } else {
                    K3();
                    return;
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                K3();
                return;
            case 7:
            case 8:
            case 9:
                String airableId = webRadioCategory.getAirableId();
                GetTreesHelper getTreesHelper = this.f37291p;
                u.g(getTreesHelper);
                WebRadioNode genresNode = getTreesHelper.getGenresNode();
                u.g(genresNode);
                this.f37288m = WebRadios.getNodeForAirableId(airableId, genresNode);
                L3();
                return;
            case 10:
                GetTreesHelper getTreesHelper2 = this.f37291p;
                u.g(getTreesHelper2);
                this.f37288m = getTreesHelper2.getPlacesNode();
                L3();
                return;
            case 11:
                GetTreesHelper getTreesHelper3 = this.f37291p;
                u.g(getTreesHelper3);
                this.f37288m = getTreesHelper3.getLanguageNode();
                L3();
                return;
            case 12:
                GetTreesHelper getTreesHelper4 = this.f37291p;
                u.g(getTreesHelper4);
                this.f37288m = getTreesHelper4.getGenresNode();
                L3();
                return;
            default:
                Fail.j("Not yet implemented " + webRadioCategory);
                return;
        }
    }

    @Override // com.withings.device.details.wsd.programs.webradio.Hilt_WsdWebRadioActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object obj;
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            obj = intent.getSerializableExtra("device", Device.class);
        } else {
            Object serializableExtra = intent.getSerializableExtra("device");
            if (!(serializableExtra instanceof Device)) {
                serializableExtra = null;
            }
            obj = (Device) serializableExtra;
        }
        this.f37280e = (Device) obj;
        this.f37285j = getIntent().getIntExtra("program_type", -1);
        Intent intent2 = getIntent();
        u.i(intent2, "getIntent(...)");
        if (i11 >= 33) {
            parcelableExtra = intent2.getParcelableExtra("alarm", DeviceAlarm.class);
        } else {
            parcelableExtra = intent2.getParcelableExtra("alarm");
        }
        this.f37281f = (DeviceAlarm) parcelableExtra;
        Intent intent3 = getIntent();
        u.i(intent3, "getIntent(...)");
        if (i11 >= 33) {
            parcelableExtra2 = intent3.getParcelableExtra("current_program", WsdProgram.class);
        } else {
            parcelableExtra2 = intent3.getParcelableExtra("current_program");
        }
        this.f37282g = (WsdProgram) parcelableExtra2;
        if (this.f37285j < 0) {
            x70.b.d(this, "Invalid argument ProgramType", new Object[0]);
            return;
        }
        w w11 = w.w();
        Device device = this.f37280e;
        u.g(device);
        Object obj2 = WsdSetProgramConversation.class;
        WsdSetProgramConversation wsdSetProgramConversation = (WsdSetProgramConversation) w11.y(device.getMacAddress(), obj2);
        this.f37283h = wsdSetProgramConversation;
        if (wsdSetProgramConversation != null && this.f37282g != null) {
            setContentView(C1987R.layout.activity_wsd_webradio);
            this.f37293r = (Toolbar) findViewById(C1987R.id.toolbar);
            this.f37294s = getColor(C1987R.color.datavizMonochromaticNeutral5);
            getWindow().setStatusBarColor(this.f37294s);
            getWindow().setNavigationBarColor(this.f37294s);
            setSupportActionBar(this.f37293r);
            ActionBar supportActionBar = getSupportActionBar();
            u.g(supportActionBar);
            supportActionBar.o(true);
            getSupportFragmentManager().h(new FragmentManager.l() { // from class: com.withings.device.details.wsd.programs.webradio.d
                @Override // androidx.fragment.app.FragmentManager.l
                public final void c() {
                    WsdWebRadioActivity.z3(WsdWebRadioActivity.this);
                }
            });
            I3();
            J3();
            WebRadiosRemoteRepository webRadiosRemoteRepository = this.f37295t;
            if (webRadiosRemoteRepository != null) {
                GetTreesHelper getTreesHelper = new GetTreesHelper(this, webRadiosRemoteRepository);
                getTreesHelper.getTrees(this);
                this.f37291p = getTreesHelper;
                return;
            }
            u.s("webRadiosRemoteRepository");
            throw null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = WsdWebRadioActivity.class;
        if (wsdSetProgramConversation != null) {
            obj2 = WsdProgram.class;
        }
        objArr[1] = obj2;
        x70.b.d(this, "%s has been launched without a %s", objArr);
        super.finish();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        u.i(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.webradio, menu);
        View actionView = menu.findItem(R.id.search).getActionView();
        u.h(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f37290o = searchView;
        searchView.setIconifiedByDefault(true);
        SearchView searchView2 = this.f37290o;
        u.g(searchView2);
        searchView2.setOnQueryTextListener(new b());
        return true;
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment.Callback
    public final void onDataLoaded(WebRadioAbstractFragment webRadioSubCategoriesFragment) {
        u.j(webRadioSubCategoriesFragment, "webRadioSubCategoriesFragment");
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment.Callback
    public final void onDataLoading(WebRadioAbstractFragment webRadioSubCategoriesFragment) {
        u.j(webRadioSubCategoriesFragment, "webRadioSubCategoriesFragment");
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment.Callback
    public final void onDataNeedsWaiting(WebRadioAbstractFragment webRadioSubCategoriesFragment, int i11) {
        u.j(webRadioSubCategoriesFragment, "webRadioSubCategoriesFragment");
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment.Callback
    public final void onFailToGetDatas(WebRadioAbstractFragment fragment) {
        u.j(fragment, "fragment");
        getSupportFragmentManager().C0();
    }

    @Override // com.withings.webradio.GetTreesHelper.Callback
    public final void onFailedToGetTrees(GetTreesHelper getTreesHelper) {
        runOnUiThread(new p0(this, 2));
    }

    @Override // com.withings.webradio.ui.WebRadioNodeFragment.Callback
    public final void onNodeSelected(WebRadioNodeFragment webRadioNodeFragment, WebRadioCategory webRadioCategory, WebRadioNode webRadioNode) {
        u.j(webRadioNodeFragment, "webRadioNodeFragment");
        u.j(webRadioCategory, "webRadioCategory");
        u.j(webRadioNode, "webRadioNode");
        this.f37288m = webRadioNode;
        if (webRadioNode.getChildren() != null) {
            List<WebRadioNode> children = webRadioNode.getChildren();
            u.g(children);
            if (!children.isEmpty()) {
                L3();
                return;
            }
        }
        K3();
    }

    @Override // com.withings.webradio.ui.WebRadioAbstractFragment.Callback
    public final void onNothingToDisplay(WebRadioAbstractFragment fragment) {
        u.j(fragment, "fragment");
        this.f37288m = new WebRadioNode(null, null, 0L, null, 15, null);
        getSupportFragmentManager().C0();
        m0 m11 = getSupportFragmentManager().m();
        m11.m(C1987R.anim.in_from_right, C1987R.anim.out_to_left, C1987R.anim.in_from_left, C1987R.anim.out_to_right);
        m11.b(new WebRadioEmptyFragment(), C1987R.id.content);
        m11.e("fragment");
        m11.f();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                Object systemService = getSystemService("input_method");
                u.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        GetTreesHelper getTreesHelper = this.f37291p;
        if (getTreesHelper != null) {
            getTreesHelper.setCallback(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        boolean z5;
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        if (i11 == 1) {
            if (grantResults.length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!z5) && grantResults[0] == 0) {
                H3();
                return;
            }
            this.f37292q = false;
            I3();
        }
    }

    @Override // com.withings.webradio.GetTreesHelper.Callback
    public final void onTreesLoaded(GetTreesHelper getTreesHelper) {
        WebRadioCategoriesFragment webRadioCategoriesFragment = new WebRadioCategoriesFragment();
        G3(webRadioCategoriesFragment);
        webRadioCategoriesFragment.setCallback(this);
    }

    @Override // com.withings.webradio.ui.WebRadioViewPagerFragment.Callback
    public final void onVolumeChanged(WebRadioViewPagerFragment webRadioListFragment, int i11) {
        u.j(webRadioListFragment, "webRadioListFragment");
        WsdProgram wsdProgram = this.f37282g;
        u.g(wsdProgram);
        short s11 = (short) i11;
        wsdProgram.F(s11);
        DeviceAlarm deviceAlarm = this.f37281f;
        if (deviceAlarm != null) {
            WsdProgram wsdProgram2 = this.f37282g;
            u.g(wsdProgram2);
            deviceAlarm.l0(wsdProgram2.d());
            DeviceAlarm deviceAlarm2 = this.f37281f;
            u.g(deviceAlarm2);
            deviceAlarm2.H0(s11);
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getIO(), null, new c(null), 2, null);
            WsdSetProgramConversation wsdSetProgramConversation = this.f37283h;
            u.g(wsdSetProgramConversation);
            DeviceAlarm deviceAlarm3 = this.f37281f;
            u.g(deviceAlarm3);
            wsdSetProgramConversation.d0(deviceAlarm3, 1);
            return;
        }
        WsdSetProgramConversation wsdSetProgramConversation2 = this.f37283h;
        u.g(wsdSetProgramConversation2);
        WsdProgram wsdProgram3 = this.f37282g;
        u.g(wsdProgram3);
        wsdSetProgramConversation2.e0(wsdProgram3, 1);
    }

    @Override // com.withings.webradio.ui.WebRadioViewPagerFragment.Callback
    public final void onWebRadioConfirmed(WebRadioViewPagerFragment webRadioListFragment, WebRadio webRadio) {
        u.j(webRadioListFragment, "webRadioListFragment");
        u.j(webRadio, "webRadio");
        this.f37286k = webRadio.getId();
        WsdProgram wsdProgram = this.f37282g;
        u.g(wsdProgram);
        wsdProgram.G(this.f37286k);
        WsdProgram wsdProgram2 = this.f37282g;
        u.g(wsdProgram2);
        wsdProgram2.H(webRadio.getTitle());
        WsdProgram wsdProgram3 = this.f37282g;
        u.g(wsdProgram3);
        wsdProgram3.v(Wpp.WEB_RADIO_ID);
        finish();
    }

    @Override // com.withings.webradio.ui.WebRadioViewPagerFragment.Callback
    public final void onWebRadioPreview(WebRadioViewPagerFragment webRadioListFragment, WebRadio webRadio) {
        short j5;
        u.j(webRadioListFragment, "webRadioListFragment");
        u.j(webRadio, "webRadio");
        this.f37286k = webRadio.getId();
        WsdProgram wsdProgram = this.f37282g;
        u.g(wsdProgram);
        wsdProgram.G(this.f37286k);
        WsdProgram wsdProgram2 = this.f37282g;
        u.g(wsdProgram2);
        wsdProgram2.v(Wpp.WEB_RADIO_ID);
        WsdSetProgramConversation wsdSetProgramConversation = this.f37283h;
        u.g(wsdSetProgramConversation);
        WsdProgram wsdProgram3 = this.f37282g;
        u.g(wsdProgram3);
        DeviceAlarm deviceAlarm = this.f37281f;
        if (deviceAlarm == null) {
            j5 = 0;
        } else {
            j5 = deviceAlarm.j();
        }
        wsdSetProgramConversation.Y(wsdProgram3, j5);
    }

    @Override // com.withings.webradio.ui.WebRadioListFragment.Callback
    public final void onWebRadioSelected(WebRadioListFragment webRadioListFragment, WebRadio webRadio, List<WebRadio> webRadios) {
        u.j(webRadioListFragment, "webRadioListFragment");
        u.j(webRadio, "webRadio");
        u.j(webRadios, "webRadios");
        WebRadioViewPagerFragment createInstance = WebRadioViewPagerFragment.createInstance(this, webRadios, webRadio, this.f37282g);
        u.g(createInstance);
        G3(createInstance);
    }

    @Override // com.withings.webradio.ui.WebRadioViewPagerFragment.Callback
    public final void stopPreview(WebRadioViewPagerFragment webRadioListFragment) {
        u.j(webRadioListFragment, "webRadioListFragment");
        WsdSetProgramConversation wsdSetProgramConversation = this.f37283h;
        u.g(wsdSetProgramConversation);
        wsdSetProgramConversation.b0();
    }
}
