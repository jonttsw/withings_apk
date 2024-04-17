package com.withings.reminder.database;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.reminder.database.SQLiteReminderRepository;
import com.withings.reminder.model.ReminderType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: SQLiteReminderRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/withings/reminder/database/AssetDefaultReminderTypesProvider;", "Lcom/withings/reminder/database/SQLiteReminderRepository$DefaultReminderTypesProvider;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "loadDefaultValues", "", "Lcom/withings/reminder/model/ReminderType;", "loadJsonFromAssets", "Lcom/google/gson/JsonArray;", "assets", "Landroid/content/res/AssetManager;", "reminder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetDefaultReminderTypesProvider implements SQLiteReminderRepository.DefaultReminderTypesProvider {
    public static final int $stable = 8;
    private final Context context;

    public AssetDefaultReminderTypesProvider(Context context) {
        u.j(context, "context");
        this.context = context;
    }

    private final JsonArray loadJsonFromAssets(AssetManager assetManager) {
        InputStream open = assetManager.open("json/reminders.json");
        u.i(open, "open(...)");
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        open.close();
        JsonArray asJsonArray = JsonParser.parseString(new String(bArr, dp0.c.f64094b)).getAsJsonArray();
        u.i(asJsonArray, "getAsJsonArray(...)");
        return asJsonArray;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.withings.reminder.database.SQLiteReminderRepository.DefaultReminderTypesProvider
    public List<ReminderType> loadDefaultValues() {
        AssetManager assets = this.context.getAssets();
        u.i(assets, "getAssets(...)");
        JsonArray<JsonElement> loadJsonFromAssets = loadJsonFromAssets(assets);
        ArrayList arrayList = new ArrayList(x.y(loadJsonFromAssets, 10));
        for (JsonElement jsonElement : loadJsonFromAssets) {
            arrayList.add((ReminderType) new Gson().fromJson(jsonElement, (Class<Object>) ReminderType.class));
        }
        return arrayList;
    }
}
