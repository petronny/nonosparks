import json
example='03-2'
data={}
data['width']=5
data['height']=1
data['answer']=[]
data['answer'].append([1,1,1,1,0])
json.dump(data,open('examples/'+example+'.json','w'))
