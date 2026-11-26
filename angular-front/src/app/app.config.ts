import { ApplicationConfig, provideBrowserGlobalErrorListeners } from '@angular/core';
import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import {provideMarkdown} from 'ngx-markdown';
import {provideHttpClient, withInterceptors} from '@angular/common/http';
import {loadingInterceptorInterceptor} from './interceptors/loading-interceptor-interceptor';

export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideRouter(routes),
    provideClientHydration(),
    provideMarkdown(),
    provideHttpClient(withInterceptors([loadingInterceptorInterceptor]))
  ],
};
