var gulp = require('gulp'),
sass = require('gulp-sass'),
rm = require('gulp-rimraf');

gulp.task('default', ['sass', 'sass:watch']);
gulp.task('build', ['sass']);

gulp.task('clean-css', function() {
	return gulp.src('./lib/css/*')
	.pipe(rm());
});

gulp.task('sass', ['clean-css'], function() {
	return gulp.src('./sass/*.scss')
	.pipe(sass().on('error', sass.logError))
	.pipe(gulp.dest('./lib/css'));
});

gulp.task('sass:watch', function () {
  gulp.watch('./sass/**/*.scss', ['sass']);
});
	
