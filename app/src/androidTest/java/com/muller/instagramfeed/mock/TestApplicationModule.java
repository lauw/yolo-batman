package com.muller.instagramfeed.mock;

import com.muller.instagramfeed.App;
import com.muller.instagramfeed.MediaActivityTest;
import com.muller.instagramfeed.activity.MediaActivity;
import com.muller.instagramfeed.activity.MediaInfoActivity;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
	library = true,
	complete = false,
	injects = {
		App.class, MediaActivity.class, MediaInfoActivity.class, MediaActivityTest.class
	}
)

public class TestApplicationModule {
	@Provides @Singleton Bus provideBus() {
		return new Bus();
	}
}
