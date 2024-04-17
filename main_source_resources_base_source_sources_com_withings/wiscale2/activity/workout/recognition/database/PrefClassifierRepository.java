package com.withings.wiscale2.activity.workout.recognition.database;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.withings.util.log.Fail;
import com.withings.webservices.legacy.common.DateTimeSerializer;
import com.withings.wiscale2.activity.workout.recognition.model.Classifier;
import com.withings.wiscale2.activity.workout.recognition.model.ClassifierRepository;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class PrefClassifierRepository implements ClassifierRepository {
    private static final String CLASSIFIERS = "classifiers";
    private SharedPreferences prefs;

    public PrefClassifierRepository(Context context) {
        this.prefs = context.getSharedPreferences(CLASSIFIERS, 0);
    }

    private Gson getGson() {
        return new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeSerializer()).create();
    }

    private String getKeyOfUserId(long j5) {
        return String.valueOf(j5);
    }

    @Override // com.withings.wiscale2.activity.workout.recognition.model.ClassifierRepository
    public void deleteByUserId(long j5) {
        this.prefs.edit().remove(getKeyOfUserId(j5)).commit();
    }

    @Override // com.withings.wiscale2.activity.workout.recognition.model.ClassifierRepository
    public Classifier getByUserId(long j5) {
        String string = this.prefs.getString(getKeyOfUserId(j5), null);
        if (string == null) {
            return null;
        }
        try {
            return (Classifier) getGson().fromJson(string, (Class<Object>) Classifier.class);
        } catch (JsonSyntaxException unused) {
            Fail.j("Unable to parse Classifier from pref");
            return null;
        }
    }

    @Override // com.withings.wiscale2.activity.workout.recognition.model.ClassifierRepository
    public void save(Classifier classifier) {
        this.prefs.edit().putString(getKeyOfUserId(classifier.getUserId()), getGson().toJson(classifier)).commit();
    }
}
