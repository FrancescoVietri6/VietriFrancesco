module.exports = function(grunt)
{
  grunt.loadNpmTasks('grunt-contrib-less');
  grunt.loadNpmTasks('grunt-contrib-watch');


    grunt.initConfig({

      less: {
            development: {
                files: {
                    'dist/css/application.css': 'src/less/application.less'
                }
            }
        },
        watch: {
            less: {
                files: ['**/*.less'],
                tasks: ['less']
            },
        },

    });



};
